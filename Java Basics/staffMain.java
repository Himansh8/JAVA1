import java.util.*;

class staff {
	void info(){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the staff code");
	   String a=sc.nextLine();
	   System.out.println("staff code is:"+a);
}
}
class teacher extends staff{
	void info2(){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the subject");
	  String a=sc.nextLine();
	  System.out.println("Subject is:"+a);
}
}
class typist extends staff {
      void info3(){
	  Scanner sc=new Scanner(System.in);	
	  System.out.println("Enter the speed:");
	  int a=sc.nextInt();
	  System.out.println("Speed in word per minute"+a);
}
}
class officer extends staff{
	void info4(){
	   Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the Grade of officer:");
	  String a=sc.nextLine();
	  System.out.println("The Grade is:"+a);
}
}
class staffMain{
	public static void main(String args[]){
          officer sc=new officer();
	  sc.info();
	  sc.info4();
	  typist sc2=new typist();
	  sc2.info();
	  sc2.info3();
	  teacher sc3=new teacher();
	  sc3.info();
	  sc3.info2();
}
}