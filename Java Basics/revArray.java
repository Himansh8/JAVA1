import java.util.*;
class revArray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a[]=new int[20];
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		System.out.println("Enter the element of array");
		for(int i=0;i<n;i++){
			int x=sc.nextInt();
			a[i]=x;
		}
		int b[]=new int[20];
		int i=n-1;
			for(int j=0;j<n;j++){
				b[j]=a[i];
				i--;
			}
		
		System.out.println("The reverse array is:");
		for(int j=0;j<n;j++){
			System.out.print(b[j]+" ");
		}
	}
}