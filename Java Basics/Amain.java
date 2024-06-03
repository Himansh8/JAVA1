class A{
	void f1(){
	   System.out.println("D");
	}
}
class B extends A{
	 void f1(){
	     super.f1();
	    System.out.println("E");
}
}
class Amain{
	public static void main(String args[]){
	  B r=new B();
	   r.f1();
}
}