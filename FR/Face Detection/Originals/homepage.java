import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class homepage extends JFrame implements ActionListener,ItemListener
{
	ImageIcon i1,i2;
	JLabel l1,l2;
	JComboBox cb;
	JButton b;
	
	homepage()
	{
		i1=new ImageIcon("final2.jpg");
		i2=new ImageIcon("cats.jpg");
		b=new JButton(i2);
		b.addActionListener(this);
		l1= new JLabel(i1);
		l2= new JLabel(i2);
		
		cb=new JComboBox();
		cb.addItem("Eyes");
		cb.addItem("Brow");
		cb.addItem("Nose");
		cb.addItem("Lips");
		cb.addItem("Face");
		cb.addItem("Ears");
		cb.addItem("Hair");
		cb.addItem("Hat");
		
		b.setBounds(1336,0,20,20);
		add(b);
		cb.setForeground(Color.white);
		l2.setBounds(680,150,50,50);
		
		cb.addItemListener(this);
		cb.setForeground(Color.gray);
		cb.setBounds(30,80,140,20);
		add(cb);
		
		l1.setBounds(0,0,1368,768);
		add(l1);
		
		
		setResizable(false);
		setUndecorated(true);
		setVisible(true);
	
		setSize(1368,768);
	}
	public void actionPerformed(ActionEvent ae)
	{
		Object o = ae.getSource();
		if(o==b)
		{
			System.exit(0);
		}
	}
	public void itemStateChanged(ItemEvent ie)
	{
		String str = (String)cb.getSelectedItem();
		l2.setIcon(i2);
	
	}

	public static void main(String args[])
	{
		new homepage();
	}
}