import java.awt.*;
class Button1{
public static void main(String args[]){
Frame f=new Frame("mini calci");
Button b=new Button("class karna ");
Button c=new Button("nhi karna ");
Button d=new Button("proxy laga dijiyega");
b.setBounds(50,200,100,150);
c.setBounds(100,400,150,180);
d.setBounds(150,600,120,190);
f.add(b);
f.add(c);
f.add(d);
f.setSize(500,500);
f.setLayout(null);
f.setVisible(true);
}
}