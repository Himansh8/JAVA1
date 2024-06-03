import java.util.*;

 class fibo{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number");
   int n=sc.nextInt();

   int fibo=0;
    int a=0;
    int b=1;
    for(int i=0;i<=n;i++){
     fibo=a+b;
     a=b;
     b=fibo;
      System.out.print(fibo+" ");
    }
 System.out.print("fibo sum="+fibo);
}
}