import java.util.*;

class mergeArray{
	public static void main(String args[]){
		
		int k=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of array 1st:");	
		int n=sc.nextInt();
		int a[]=new int[20];
		int c[]=new int[20];
		System.out.println("Enter the element of 1st array:");
		for(int i=0;i<n;i++){
			int x=sc.nextInt();
			a[i]=x;
		}
		System.out.println("Enter the size of 2nd array:");
		int m=sc.nextInt();
		int b[]=new int[20];
		System.out.println("Enter the element of array 2nd:");
		for(int j=0;j<m;j++){
			int y=sc.nextInt();
			b[j]=y;
		}
		for(int i=0;i<n;i++){
			c[k]=a[i];
			k++;
		}
		for(int j=0;j<m;j++){
			c[k]=b[j];
			k++;
		}
		System.out.println("The merge array is:");
		for(int i=0;i<k;i++){
			System.out.print(c[i]+" ");
		}
		
	}
}