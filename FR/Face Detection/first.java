
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.*;

class first extends JFrame  implements ActionListener
{
	JLabel l2;
	ImageIcon i,i1;
	JButton b;

	
	

  first()
	{
		super("WELCOME");
		
	
	i1 = new ImageIcon("bg2.jpg");
	i = new ImageIcon("icon.jpg");
	b = new JButton(".",i);
	l2 = new JLabel(i1);

	setLayout(null);
	
	l2.setBounds(0,0,587,328);

	b.setBounds(320,45,45,45);
	
	
	setSize(580,325);

	 b.addActionListener(this);
	
	setResizable(false);
		setUndecorated(true);
        add(b);
	add(l2);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLocation(
	(Toolkit.getDefaultToolkit().getScreenSize().width-getWidth())/2,
	(Toolkit.getDefaultToolkit().getScreenSize().height-getHeight())/2
	);
	
	
        	
	setVisible(true);
	
}
public void actionPerformed(ActionEvent ae)
{
Object o = ae.getSource();
if(o==b)
{
this.dispose();
new login();
}
}

            public static void main(String args[])
	{
		new first();
	}
}
	