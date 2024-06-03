import java.util.*;

class Solution {
	public static void main(String args[]){ 
    
	 int n; int x;int i;int j;int k;
Scanner sc=new Scanner(System.in);
 int arr[] =new int[10];
 n=sc.nextInt();
for( i=0;i<n;i++){
   x= sc.nextInt();
  arr[i]=x;
	}
	for( i=0;i<(n-1);i++){
	    for( j=(i+1);j<n;j++){
	        if(arr[i]>arr[j]){
	             k=arr[i];
	            arr[i]=arr[j];
	            arr[j]=k;
	        }
	    }
	}
	System.out.print(arr[i-1]);
} 
}
