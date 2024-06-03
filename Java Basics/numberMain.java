class number{
  int a; int b;int m;
   number(){
	a=4;
	b=6;
      }
   int hcf(){
	for(int i=1;i<=a&&i<=b;i++){
	if(a%i==0&&b%i==0){
	m=i;
          }
	
   
       }
       return m;
   }
 int lcm()
        {
	int x=(a*b)/m;
	return x;
       }
 }
class numberMain{
   public static void main(String args[]){
	number r= new number();
	System.out.println("HCF is:"+r.hcf()+" "+"LCM is:"+r.lcm());
     }
}

			