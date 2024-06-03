import java.util.Scanner;
class Tester {
	public static void main(String[] args) {
	   int n,p,fact=1;
       int i;

       System.out.println("Enter the number:");
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       System.out.println("Enter the power:");
       p=sc.nextInt();

       for(i=0;i<p;i++)
       {
        fact=fact*n;
        System.out.print(" "+fact);
       }
	}
}