class conOver{
	int a; int b; int c;
    conOver(){
		a=23; b=12; c=41;
	    }
    conOver(int a){
		a=x;
		}
    conOver(int a, int b){
		a=x; b=y;
		}
	  }
  
class conOverMain{
	public static void main(String args[]){
	int x; int y; 
		conOver r=new conOver();
			r.conOver();
		System.out.println(a+" "+b+" "+c);
		conOver r1=new conOver(x=123,y=34);
			r1.conOver();
		System.out.println(a+" "+b);
		conOver r2=new conOver(x=56);
			r2.conOver();
		System.out.println(a);
	}
   }
		