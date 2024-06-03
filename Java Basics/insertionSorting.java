import java.util.*;

class insertionSorting{
 public static void main(String args[]){
	System.out.println("Enter the array number:");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[20];
	System.out.println("Enter the array element:");
	for(int i=0;i<n;i++){
	    int x=sc.nextInt();
		a[i]=x;
	}
	
	for(int i=1;i<n;i++){
		int temp=a[i];
		int j=i-1;
	   for(;j>=0;j--){
		 if(a[j]>temp){
		  a[j+1]=a[j];   	
		 }else
		 {
			break;
		 }
	   }
		a[j+1]=temp;
	}

	for(int i=0;i<n;i++){
	   System.out.print(a[i]+" ");
	 }
	}
}