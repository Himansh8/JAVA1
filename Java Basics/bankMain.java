import java.util.*;
 
 class Bank{
     void infobank(){
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter the name of Bank");
		String a=sc.nextLine();
		System.out.println("Name of Bank is:"+a);
		System.out.println("Enter the branch of bank");
		String b=sc.nextLine();
		System.out.println("The branch of bank is:"+b);
		System.out.println("Enter the branch code");
		String c=sc.nextLine();
		System.out.println("The branch code is:"+c);
	}
      }
}
class saving extends Bank{
     void infosaving(){
	try (Scanner sc2 = new Scanner(System.in)) {
		System.out.println("Enter the name:");
		String d= sc2.nextLine();
		System.out.println("The name account holder:"+d);
		System.out.println("Enter the Account number:");
		int e= sc2.nextInt();
		System.out.println(" The Account number:"+e);
		System.out.println("Enter the amount:");
		int f= sc2.nextInt();
		System.out.println("The amount:"+f);
	}
   }
}

class loan extends Bank{
   void infoLoan(){
	Scanner sc3=new Scanner(System.in);
	System.out.println("Enter the borrower name:");
	String g= sc3.nextLine();
	System.out.println(" The borrower name:"+g);
	System.out.println("Enter the Loan Account number:");
	int h= sc3.nextInt();
	System.out.println("The Loan Account number:"+h);
	System.out.println("Enter the Loan type:");
	String i= sc3.nextLine();
	System.out.println("The Loan type:"+i);
    }
}


 class bankMain{
    public static void main(String args[]){
	loan r=new loan();
	 r.infobank();
	 r.infoLoan();
	saving f=new saving();
	 f.infobank();
	 f.infosaving();
}
}















