import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.image.BufferedImage;

import java.awt.Rectangle;
import java.awt.Dimension;

import java.awt.Toolkit;

import java.awt.Robot;

import java.io.File;

import javax.imageio.ImageIO;


class homepage extends JFrame implements ActionListener,ItemListener
{
	ImageIcon i1,i2;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,lf,le,ln,ll,lh,lb,lm,ley,lr,l12;
	JComboBox cb,cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8;
	JButton b,b1,b2,b3,b4,b5,b6,b7,b8,b9;
	Font f;
	Connection con,con1,con2,con3,con4,con5,con6,con7;
	PreparedStatement ps,ps1,ps2,ps3,ps4,ps5,ps6,ps7;
	ResultSet rs,rs1,rs2,rs3,rs4,rs5,rs6,rs7;

	Connection c1,c2,c3,c4,c5,c6,c7,c8;
	PreparedStatement p1,p2,p3,p4,p5,p6,p7,p8;
	ResultSet r1,r2,r3,r4,r5,r6,r7,r8;
	String s_face="",s_eye="",s_nose="",s_lips="",s_ear="",s_hair="",s_beard="",s_mustache="";
	
	homepage()
	{
		i1=new ImageIcon("final2.jpg");
		i2=new ImageIcon("cats.jpg");
		b=new JButton(i2);
		b1=new JButton("submit");
		b2=new JButton("submit");
		b3=new JButton("submit");
		b4=new JButton("submit");
		b5=new JButton("submit");
		b6=new JButton("submit");
		b7=new JButton("submit");
		b8=new JButton("submit");
		b9=new JButton("Save");
		b.addActionListener(this);



		l1= new JLabel(i1);
		l2= new JLabel(i2);
		l3= new JLabel("FACE");
		l4= new JLabel("EYE");
		l5= new JLabel("NOSE");
		l6= new JLabel("LIPS");
		l7= new JLabel("EAR");
		l8= new JLabel("HAIR");
		l9= new JLabel("BEARD");
		l10= new JLabel("MUSTACHE");
		l11=new JLabel();
		l12=new JLabel("RELIGION");
		lr=new JLabel();	
		

		lf=new JLabel();
		le=new JLabel();
		lb=new JLabel();
		ln=new JLabel();
		lm=new JLabel();
		ley=new JLabel();
		ll=new JLabel();
		lh=new JLabel();
		
		lf.setBounds(640,130,400,400);
		ley.setBounds(600,250,400,150);
		le.setBounds(600,280,400,150);
		lb.setBounds(600,380,400,250);
		ln.setBounds(600,200,400,450);
		lm.setBounds(670,310,400,150);
		ll.setBounds(700,360,200,150);
		lh.setBounds(665,80,400,350);
		lr.setBounds(550,60,400,300);

		/*ley.setBounds(600,230,400,150);
		le.setBounds(600,180,400,150);
		lb.setBounds(600,380,400,250);
		ln.setBounds(600,190,400,450);
		lm.setBounds(670,300,400,150);
		ll.setBounds(700,340,200,150);
		lh.setBounds(600,150,400,150);*/

		 f= new Font("Segoe UI Symbol",Font.BOLD,20);
		
		cb =new JComboBox();
		cb1=new JComboBox();
 		cb2=new JComboBox();
		cb3=new JComboBox();
		cb4=new JComboBox();
		cb5=new JComboBox();
		cb6=new JComboBox();
		cb7=new JComboBox();
		cb8=new JComboBox();
		
		cb8.addItem("None");
		cb8.addItem("Hindu Cap");
		cb8.addItem("Muslim Cap");
		cb8.addItem("Sikh Turban");

		cb8.addItemListener(this);
		
		b.setBounds(1336,0,20,20);
		
		cb.setForeground(Color.white);
		
		
		cb.addItemListener(this);
		cb.setForeground(Color.gray);
		setLayout(null);
		
		b1.setBounds(140,140,80,20);
		b2.setBounds(140,210,80,20);
		b3.setBounds(140,280,80,20);
		b4.setBounds(140,350,80,20);
		b5.setBounds(140,420,80,20);
		b6.setBounds(140,490,80,20);
		b7.setBounds(140,560,80,20);
		b8.setBounds(140,630,80,20);
		b9.setBounds(1250,710,80,30);
		

		
		cb1.setBounds(30,140,100,20);
		cb2.setBounds(30,210,100,20);
		cb3.setBounds(30,280,100,20);
		cb4.setBounds(30,350,100,20);
		cb5.setBounds(30,420,100,20);
		cb6.setBounds(30,490,100,20);
		cb7.setBounds(30,560,100,20);
		cb.setBounds(30,630,100,20);
		cb8.setBounds(1150,140,100,20);
		
		add(cb);
		add(cb1);
		add(cb2);
		add(cb3);
		add(cb4);
		add(cb5);
		add(cb6);
		add(cb7);
		add(cb8);
		
		l1.setBounds(0,0,1368,768);
		l2.setBounds(680,150,50,50);
		l3.setBounds(30,120,140,20);
		l4.setBounds(30,190,140,20);
		l5.setBounds(30,260,140,20);
		l6.setBounds(30,330,140,20);
		l7.setBounds(30,400,140,20);
		l8.setBounds(30,470,140,20);
		l9.setBounds(30,530,140,20);
		l10.setBounds(30,610,140,20);
		l11.setBounds(600,330,140,20);
		l12.setBounds(1150,115,140,20);
		
		l12.setForeground(Color.white);

		


		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);

		







		
                    l3.setForeground(Color.white);
                    l4.setForeground(Color.white);
                    l5.setForeground(Color.white);
                    l6.setForeground(Color.white);
                    l7.setForeground(Color.white);
                    l8.setForeground(Color.white);
                    l9.setForeground(Color.white);
	 	    l10.setForeground(Color.white);
		
		add(lr);
		add(ln);
		add(lh);
		add(ll);
		add(lb);
		add(lm);
		add(le);
		add(ley);
		add(lf);
		

		add(b);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);

		add(b6);
		add(b7);
		add(b8);
		add(b9);
		
		
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		add(l8);
		add(l9);
		add(l10);
		add(l11);
		add(l12);
		
		
		add(l1);		


		try
		{
			/*Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con=DriverManager.getConnection("Jdbc:Odbc:mydsn","face","detect");
			c1=DriverManager.getConnection("Jdbc:Odbc:mydsn","face","detect");
			c2=DriverManager.getConnection("Jdbc:Odbc:mydsn","face","detect");
			c3=DriverManager.getConnection("Jdbc:Odbc:mydsn","face","detect");
			c4=DriverManager.getConnection("Jdbc:Odbc:mydsn","face","detect");
			c5=DriverManager.getConnection("Jdbc:Odbc:mydsn","face","detect");
			c6=DriverManager.getConnection("Jdbc:Odbc:mydsn","face","detect");
			c7=DriverManager.getConnection("Jdbc:Odbc:mydsn","face","detect");
			c7=DriverManager.getConnection("Jdbc:Odbc:mydsn","face","detect");
*/
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ducat","ducat");
			c1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ducat","ducat");
			c2=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ducat","ducat");
			c3=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ducat","ducat");
			c4=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ducat","ducat");
			c5=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ducat","ducat");
			c6=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ducat","ducat");
			c7=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ducat","ducat");
			//c8=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ducat","ducat");

			ps = con.prepareStatement("select * from face");
			rs=ps.executeQuery();

 			c1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ducat","ducat");
			//con1=DriverManager.getConnection("Jdbc:Odbc:mydsn","face","detect");
			ps1 = con.prepareStatement("select * from eye");
			rs1=ps1.executeQuery();
c2=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ducat","ducat");
			
			//con2=DriverManager.getConnection("Jdbc:Odbc:mydsn","face","detect");
			ps2= con.prepareStatement("select * from nose");
			rs2=ps2.executeQuery();
			
			c3=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ducat","ducat");
			//con3=DriverManager.getConnection("Jdbc:Odbc:mydsn","face","detect");
			ps3 = con.prepareStatement("select * from lips");
			rs3=ps3.executeQuery();
			
			c4=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ducat","ducat");
			//con4=DriverManager.getConnection("Jdbc:Odbc:mydsn","face","detect");
			ps4 = con.prepareStatement("select * from ear ");
			rs4=ps4.executeQuery();
		c5=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ducat","ducat");
			
			//con5=DriverManager.getConnection("Jdbc:Odbc:mydsn","face","detect");
			ps5 = con.prepareStatement("select * from hair");
			rs5=ps5.executeQuery();

			c6=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ducat","ducat");
			//con6=DriverManager.getConnection("Jdbc:Odbc:mydsn","face","detect");
			ps6 = con.prepareStatement("select * from beard");
			rs6=ps6.executeQuery();

c7=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ducat","ducat");
			
			//con7=DriverManager.getConnection("Jdbc:Odbc:mydsn","face","detect");
			ps7 = con.prepareStatement("select * from mustache");
			rs7=ps7.executeQuery();

			
			while(rs.next())
			{
				cb1.addItem(rs.getString(2));	
		                 	}
			

			while(rs1.next())
			{
				cb2.addItem(rs1.getString(2));
			}
			while(rs2.next())
			{
				cb3.addItem(rs2.getString(2));
			}

			while(rs3.next())
			{
				cb4.addItem(rs3.getString(2));
			}
		
			while(rs4.next())
			{
				cb5.addItem(rs4.getString(2));
			}	

			while(rs5.next())
			{
				cb6.addItem(rs5.getString(2));
			}
	
			while(rs6.next())
			{
				cb7.addItem(rs6.getString(2));
			}
			while(rs7.next())
			{
				cb.addItem(rs7.getString(2));
			}
			
		}
		
		catch(Exception e)
		{
		}	
		
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
		if(o==b1)
		{
			try
			{	
			p1=c1.prepareStatement("select * from face where face_type=?");
			p1.setString(1,(String)cb1.getSelectedItem());
			r1=p1.executeQuery();
			if(r1.next())
				s_face=r1.getString(3);
				System.out.println(s_face);
			lf.setIcon(new ImageIcon("img\\"+s_face));
			}
			catch(Exception e)
			{	
			}
		}	
			if(o==b2)
		{
			try
			{	
			p2=c2.prepareStatement("select * from eye where eye_type=?");
			p2.setString(1,(String)cb2.getSelectedItem());
			r2=p2.executeQuery();
			if(r2.next())
				s_eye=r2.getString(3);
				System.out.println(s_eye);
			ley.setIcon(new ImageIcon("img\\"+s_eye));
			}
			catch(Exception e)
			{	
			}
		}
			if(o==b3)
		{
			try
			{	
			p3=c3.prepareStatement("select * from nose where nose_shape=?");
			p3.setString(1,(String)cb3.getSelectedItem());
			r3=p3.executeQuery();
			if(r3.next())
				s_nose=r3.getString(3);
				System.out.println(s_nose);
			ln.setIcon(new ImageIcon("img\\"+s_nose));
			}
			catch(Exception e)
			{	
			}
		}		
		if(o==b4)
		{
			try
			{	
			p4=c4.prepareStatement("select * from lips where lips_type=?");
			p4.setString(1,(String)cb4.getSelectedItem());
			r4=p4.executeQuery();
			if(r4.next())
				s_lips=r4.getString(3);
				System.out.println(s_lips);
			ll.setIcon(new ImageIcon("img\\"+s_lips));
			}
			catch(Exception e)
			{	
			}
		}
			if(o==b5)
		{
			try
			{	
			p5=c5.prepareStatement("select * from ear where ear_shape=?");
			p5.setString(1,(String)cb5.getSelectedItem());
			r5=p5.executeQuery();
			if(r5.next())
				s_ear=r5.getString(3);
				System.out.println(s_ear);
			le.setIcon(new ImageIcon("img\\"+s_ear));
			}
			catch(Exception e)
			{	
			}
		}		
			if(o==b6)
		{
			try
			{	
			p6=c6.prepareStatement("select * from hair where hair_type=?");
			p6.setString(1,(String)cb6.getSelectedItem());
			r6=p6.executeQuery();
			if(r6.next())
				s_hair=r6.getString(3);
				System.out.println(s_hair);
			lh.setIcon(new ImageIcon("img\\"+s_hair));
			}
			catch(Exception e)
			{	
			}
		}
			if(o==b7)
		{
			try
			{	
			p7=c7.prepareStatement("select * from beard where beard_shape=?");
			p7.setString(1,(String)cb7.getSelectedItem());
			r7=p7.executeQuery();
			if(r7.next())
				s_beard=r7.getString(3);
				System.out.println(s_beard);
			lb.setIcon(new ImageIcon("img\\"+s_beard));
			}
			catch(Exception e)
			{	
			}
		}	
			if(o==b8)
		{
			try
			{	
			p7=c7.prepareStatement("select * from mustache where mustache_shape=?");
			p7.setString(1,(String)cb.getSelectedItem());
			r7=p7.executeQuery();
			if(r7.next())
				s_mustache=r7.getString(3);
				System.out.println(s_mustache);
			lm.setIcon(new ImageIcon("img\\"+s_mustache));
			}
			catch(Exception e)
			{	
			}
		}
			if(o==b9)
			{
				try 
	
		{
       


		Toolkit tool = Toolkit.getDefaultToolkit();
  
		Dimension d = tool.getScreenSize();
       
		Rectangle rect = new Rectangle(d);
       
		Robot robot = new Robot();
      
		 Thread.sleep(2000);
      
		 File f = new File("snap.jpg");
       
		BufferedImage img = robot.createScreenCapture(rect);
      
                ImageIO.write(img,"jpeg",f);
      
		tool.beep();
      
		     } 
		                catch(Exception e)
				{
        
				e.printStackTrace();
      
				}
  
		}		
		
	}
	public void itemStateChanged(ItemEvent ie)
	{
		String str = (String)cb8.getSelectedItem();
		if(str.equals("None"))
			lr.setIcon(new ImageIcon(""));
		
		if(str.equals("Hindu Cap"))
			lr.setIcon(new ImageIcon("a.png"));
		
		if(str.equals("Muslim Cap"))
			lr.setIcon(new ImageIcon("b.png"));
		if(str.equals("Sikh Turban"))
			lr.setIcon(new ImageIcon("c.png"));
				
		
	
	}

	public static void main(String args[])
	{
		new homepage();
	}
}