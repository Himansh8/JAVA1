import java.util.*;

class quickSort{
	int ub,lb,start,end;
	 static int partion(arr,lb,ub){
			int pivote=arr[0];
			start=lb;
			end=ub;
			while(start<end){
				while(pivote>=arr[start]){
					start++;
				}
				while(pivote<=arr[end]){
					end--;
				}
				if(start<end){
					int temp=arr[start];
					arr[start]=arr[end];
					arr[end]=temp;
				}
			}
			int flag=arr[lb];
			arr[lb]=arr[end];
			arr[end]=flag;
			return end;
	 }
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int n=sc.nextInt();
		int arr[]=new int[20];
		System.out.println("Enter the element in array:");
		for(int i=0;i<n;i++){
			int x=sc.nextInt();
			arr[i]=x;
		}
		lb=arr[0];
		ub=arr[n-1];
		sort(arr,lb,ub){
			if(lb<ub){
				loc=partion(arr,lb,ub);
				sort(arr,loc+1,ub);
				sort(arr,lb,ub-1);
			}
		}
	}
}