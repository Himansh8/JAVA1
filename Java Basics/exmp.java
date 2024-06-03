import java.awt.*;
import java.awt.event.*;

import javafx.event.ActionEvent;
public class exmp
{
	public static void main(String args[])
{
	Frame f=new Frame("Example");
	Button b=new Button("sum");
	b.setBounds(50,100,70,20);
	b.setBackground(Color.red);
	f.add(b);
	f.setSize(400,400);
	f.setLayout(null);
	f.setVisible(true);
	Button b1=new Button("Hello");
	b1.setBounds(50,120,70,20);
	f.add(b1);
	Label l=new Label("aman");
	l.setBounds(130,100,70,20);
	Label l1=new Label("himanshu");
	l1.setBounds(130,120,70,20);
	f.add(l);
	f.add(l1);
	TextField t=new TextField();
	t.setBounds(50,200,50,20);
	f.add(t);
	TextField t1=new TextField();
	t1.setBounds(150,200,50,20);
	f.add(t1);
	/*public void ActionPerformed(ActionEvent e);{
		String z,zt;
		if(e.getSource()==b){
			zt=l.getText();
			z=zt+"1";
			l.setText(z);
		}

	}*/
}
}