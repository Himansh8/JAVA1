				//methode overloading//
class areaMain{
	public static void main(String args[]){
	area f=new area();
	f.area(5,6);
	f.area(5,6,7);
	f.area(4);
	
}
} 
 class area{
		int area=1;
	void area(int x){
		area=x*x;
		System.out.println("Area of square"+area);
		}
	void area(int x,int y){ 
       		area=x*y;
		System.out.println("Area of rectangle"+area);
		}
	void area(int x,int y,int z){
		area= 2*(x*y+y*z+z*x);
		System.out.println("Area of cuboid"+area);
		}
	}