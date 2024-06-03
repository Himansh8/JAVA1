class Gp{
	int a;
       Gp(int x){
	    a=x;
		}
    void show(){
	    System.out.println(a);
	}
}
class F extends Gp{
        int b;
        F(int x,int y){
	  super(x);
     	   b=y;
	 }
	void show(){
	super.show();
	System.out.println(b);
	}
}
class GpMain{
	public static void main(String args[]){
         F r=new F(4,9);
	 r.show();
}
}