import java.util.*;

class std{

    int roll; String name;
    std(int a,String b){
 	 roll=a;
	 name=b;
	}
   void print(){
	System.out.println("roll no:"+roll+" "+"Name: "+name);
	}
}

 class stdMain{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	 int roll=sc.nextInt();
	 sc.nextLine();
	 String name=sc.nextLine();
	std r=new std(roll, name);
	r.input();
	r.print();
}
}
	