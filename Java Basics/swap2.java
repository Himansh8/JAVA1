import java.util.*;
 
 class swap2{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the first number");
   int a=sc.nextInt();
 System.out.println("Enter the second number");
   int b=sc.nextInt();
  int c=0;

   c=a+b;
   b=c-b;
   a=c-a;
System.out.println("After swaring");
System.out.println(a);
System.out.println(b);
}
}