import java.util.*;

class selectionSorting{
    public static void main(String args[]){
        System.out.print("Enter the No. of Element:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
	    int a[]=new int[20];
	    System.out.println("Enter the Element of Array");
	 for(int i=0;i<n;i++){
		int x=sc.nextInt();
		a[i]=x;
			}
	 for(int i=0;i<(n-1);i++){
		int num=i;
		for(int j=(i+1);j<n;j++){
			 if(a[i]>a[j]){
				num=j;
				}
			}
		int k=a[i];
		a[i]=a[num];
		a[num]=k;	
	  }
	 for(int i=0;i<n;i++){
		System.out.print(a[i]+"\t");
		}
        }
    }


 
