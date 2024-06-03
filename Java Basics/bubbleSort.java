import java.util.*;
 
class bubbleSort{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("Enter the array size:");
		int n=sc.nextInt();
		System.out.println("Enter the array element:");
		for(int i=0;i<n;i++){
			int x=sc.nextInt();
			a[i]=x;
		}
		for(int i=0;i<n-1;i++){
			int flag=0;
			for(int j=0;j<n-1-i;j++){
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag++;
				}
			}
			if(flag==1)
				break;
		}
		System.out.println("The sorted array is:");
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
}