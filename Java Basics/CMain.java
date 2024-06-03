class A{
  String a= "himanshu ";
}
class B extends A{
    String b="sharma";
}
class C extends A{
  int c= 23;
}
 class CMain{
   public static void main(String args[]){
	C s=new C();
 	 System.out.println(s.a+" "+s.c);
	B ss=new B();
	 System.out.println(ss.b+" "+ss.a);
}
}