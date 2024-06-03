class box{
	
	int a;
	int b;
	int c;
	//parametrise constructor 
	box(int x,int y){
		a=x;
		b=y;
	}
	//Non parametrise constructor
	box(){
		a=30;
		b=40;
	}
	//Copy constructor
	box(box b2){
		a=b2.a;
		b=b2.b;
	}
	// this keyword
	box(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	void show(){
		System.out.println(a);
		System.out.println(b);
	}
	
	void show1(){
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}

class checkCon{
	public static void main(String args[]){
		
		box b1=new box(10,20);
			b1.show();
		box b2=new box();
			b2.show();
			b1.show();
		box b3=new box(b2);
			b3.show();
		box b4=new box(11,22,33);
			b4.show1();
	}
}