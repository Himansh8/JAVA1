import java.awt.*;

class calci{
  public static void main(String args[]){

	Frame f=new Frame("calculator");
	Button b=new Button("+");
	Button b1=new Button("-");
	Button b2=new Button("*");
	Button b12=new Button("/");
	b.setBounds(50,100,50,50);
	b1.setBounds(100,100,50,50);
	b2.setBounds(150,100,50,50);
	b12.setBounds(200,100,50,50);
	Button b3=new Button("1");
	Button b4=new Button("2");
	Button b5=new Button("3");
	Button b6=new Button("4");
	Button b7=new Button("5");
	Button b8=new Button("6");
	Button b9=new Button("7");
	Button b10=new Button("8");
	Button b11=new Button("9");
	Button b13=new Button("0");
	Button b14=new Button("=");
	Button b15=new Button("AC");
	b3.setBounds(50,150,50,50);
	b4.setBounds(100,150,50,50);
	b5.setBounds(150,150,50,50);
	b6.setBounds(50,200,50,50);
	b7.setBounds(100,200,50,50);
	b8.setBounds(150,200,50,50);
	b9.setBounds(50,250,50,50);
	b10.setBounds(100,250,50,50);
    b13.setBounds(50,300,150,50);
	b11.setBounds(150,250,50,50);
	b14.setBounds(200,150,50,150);
	b15.setBounds(200,300,50,50);
	f.add(b);
	f.add(b1);
	f.add(b2);
	f.add(b3);
	f.add(b4);
	f.add(b5);
	f.add(b6);
	f.add(b7);
	f.add(b8);
	f.add(b9);
	f.add(b10);
	f.add(b11);
	f.add(b12);
	f.add(b13);
	f.add(b14);
	f.add(b15);
	f.setSize(500,500);
	f.setLayout(null);
	f.setVisible(true);
	//TextField t=new TextFeild();
	//t.setBound(
}
}