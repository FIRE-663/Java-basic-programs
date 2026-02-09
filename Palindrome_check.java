import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    String str=in.nextLine();
	    str=str.toLowerCase();
	    int n=str.length();
	    int l=0,r=n-1;
	    while(l<r){
	        if(str.charAt(l)!=str.charAt(r)){
	            System.out.println("Not a palindrome");
	            
	        }
	        l++;
	        r--;
	    }
		System.out.println("It is a palindrome");
	}
}
