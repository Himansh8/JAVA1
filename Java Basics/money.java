class baba{
   int a= 50000;
}
class chacha extends baba{
  int b=30000; 
}
class papa extends baba{
   int c=20000;
}
class child extends papa{
  int d=0;
}
class cousin extends chacha{
  int e= 50000;
}
  class money{
 public static void main(String args[]){
     cousin s=new cousin();
   System.out.println(s.e+" "+s.b+" "+s.a);
	child ss=new child();
   System.out.println(ss.d+" "+ss.c+" "+ss.a);
}
}