
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class mf extends JFrame 
{
JLabel l1;
JButton b1,b2;
Font f;
ImageIcon i;



mf()
{
	super("WELCOME");
i = new ImageIcon("j.jpg");
l1 = new JLabel(i);
b1=new JButton("New Face");
b2=new JButton("Select Existing");


f=new Font("Sanserif",Font.BOLD,20);

setLayout(null);

l1.setBounds(0,0,1360,786);
b1.setBounds(540,260,250,40);
b2.setBounds(540,350,250,40);

b1.setFont(f);
b2.setFont(f);







add(b1);
add(b2);
add(l1);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}


public static void main(String args[])
	{
		new mf();
	}
}


