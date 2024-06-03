import java.util.*;
class employee{
    String a; int mob_no;
    void f1(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name");
	a=sc.nextLine();
	System.out.println("Enter the mobile number");
	mob_no= sc.nextInt();
	System.out.println(a+" "+mob_no);
	} 
}

class salary extends employee{
	double sal;
	int year;
    void f2(){ 
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the salary");
	double sal=sc.nextDouble();
    System.out.println("Enter the year");
	int year= sc.nextInt(); 
	System.out.println(sal*year);
	}
}
class wage extends employee{
	double wag;
	int mon;
   void f3(){
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter the wage");
	double wag=sc.nextDouble();
	System.out.println("Enter the month");
	int mon= sc.nextInt(); 
	System.out.println(wag*mon);
	}
}
class employeeMain{
  public static void main(String args[]){
  	salary s=new salary();
	s.f1();
 	s.f2();
	wage ss=new wage();
	    ss.f1();
	    ss.f3();
}
}
