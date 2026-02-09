import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int arr[]={2,4,5,3,1};
      int n=5,k=3;
      int sum=0,maxs=0;
      for(int i=0;i<n;i++){
       sum+=arr[i];
       if(i>=n-k){
        maxs=Math.max(maxs,sum);
        sum-=arr[i-k+1];
      }
      }
System.out.println(maxs);
	}
}
