 import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.*;
import java.sql.*;
import jaco.mp3.player.*;
import java.io.*;

class login extends JFrame implements ActionListener
{

          JLabel l1,l2,l3;
           JTextField t1;
           JPasswordField t2;
              JButton b1,b2;
	ImageIcon i;
	 Font f;
MP3Player player;
Connection con;
PreparedStatement ps;
ResultSet rs;

 login()
         {
                 super("LOGIN");
			setTitle("LOGIN");
			setLayout(null);
                   

	player = new MP3Player(new File("mp3\\sa.mp3"));
	player.play();
   
                   i = new ImageIcon("hd.jpg");
	l3 = new JLabel(i);
                
                   l1 = new JLabel("User name     ");
                   l2 = new JLabel("Password          ");
	
		
	   t1= new JTextField(10);
                   t2= new JPasswordField(10);
	              f= new Font("Segoe UI Symbol",Font.BOLD,15);
	
                   b1= new JButton("Login");
                   b2= new JButton("Register");

setResizable(false);
setUndecorated(true);

	b1.addActionListener(this);
        b2.addActionListener(this);
	  l1.setBounds(650,300,120,35);
                   t1.setBounds(800,300,200,20);
                   
                   l2.setBounds(650,360,120,35);
                   t2.setBounds(800,360,200,20);
	
	   l3.setBounds(0,0,1360,786);
	   
                   b1.setBounds(680,470,100,30);
                   b2.setBounds(800,470,100,30);
add(b1);
                    add(b2);

	    add(l1);
                    add(l2);
	    add(l3);
	
	 add(t1);
                    add(t2);
                   

                   
	   
	 
                     l1.setFont(f);
                     l2.setFont(f);

	  l1.setForeground(Color.black);
                    l2.setForeground(Color.black);


	
                   t1.setFont(f);
                   t2.setFont(f);

	  b1.setFont(f);
                   b2.setFont(f);

	 t1.setForeground(Color.black);
                   t2.setForeground(Color.black);

	
    		 setSize(1368,768);
                   
                 
                     
                     setVisible(true);
 
                     }
                                        public void actionPerformed(ActionEvent ae)
                  {
                    Object o=ae.getSource();
                    if(o==b1)
                       {	

		String uname,pass;
		uname=t1.getText();
		pass=t2.getText();
		
	try
                          {
con=DriverManager.getConnection("Jdbc:Odbc:mydsn","face","detect");
	ps=con.prepareStatement("select*from login where uname=? and pass=?");

		ps.setString(1,uname);
		ps.setString(2,pass);
		rs=ps.executeQuery();
		
		if(rs.next())
		{
		System.out.println("Valid User.");
JOptionPane.showMessageDialog(this,"Valid User","Done",JOptionPane.INFORMATION_MESSAGE);

this.dispose();
new homepage();

}
else
{
System.out.println("Invalid User....");
JOptionPane.showMessageDialog(this,"Invalid User","Error",JOptionPane.ERROR_MESSAGE);
}
}
	catch(Exception e)
{
	System.out.println(e);
}
}


                     if(o==b2)
{
this.dispose();
new register();
}
}            
        public static void main(String args[])

                   {
                       new login();
                         
                   }


}

