 class employe{
	String name;
	 double salary;
 	employe(String b){
	    name=b;
	}
        employe(double a){
	   salary=a;
	}

	void printName(){
	  System.out.println("Name of employe is: "+name);
		}
 	void printSalary(){
	  System.out.println("salary of employe is: "+salary);
		}
}   
  class employeMain{
	public static void main(String args[]){
	employe e1=new employe(70000.0);
		e1.printSalary();
	employe e2=new employe("shiv");
		e2.printName();
}
}