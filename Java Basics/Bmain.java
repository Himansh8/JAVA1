class A{
	String a="Welcome at";
}
class B extends A {
 	int b=18;
}
class C extends B{
	String c="java world";
}

 class BMain
{
public static void main(String args[]){
	
		C s= new C();
	System.out.println(s.a);
	System.out.println(s.b);
	System.out.println(s.c);
}
}