 import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
//import javax.swing.border.*;

class register extends JFrame implements ActionListener
{

          JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
          JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
          JButton b1,b2,b3;
          JComboBox cb,cb1,cb2;
          Font f,f1;
          JPasswordField p2;
          ImageIcon n;

          register()
         {
                 super("Registration");
			setTitle("Registration");
			setLayout(null);
	
                      
                   
                   n = new ImageIcon("sas.jpg");
                   l1 = new JLabel("First Name           ");
                   l2 = new JLabel("Last Name          ");
                   l3 = new JLabel("Email                  ");
                   l4 = new JLabel("Date Of Birth       ");
                   l5 = new JLabel("Gender                 ");
                   l6 = new JLabel("Address                ");
                   l7 = new JLabel("City                   ");
                   l8 = new JLabel("State                  ");
                   l9 = new JLabel("PIN Code               ");
                   l10= new JLabel(n);
              	   l11= new JLabel("Username               ");
		   l12= new JLabel("password               ");
                  
 
                 
                     
                   t1= new JTextField(10);
                   t2= new JTextField(10);
                   t3= new JTextField(10);
                   t4= new JTextField(10);
                   t5= new JTextField(10);
                   t6= new JTextField(10);
                   t7= new JTextField(10);
                   t8= new JTextField(10);
                   t9= new JTextField(10);
		   t10= new JTextField(10);
		   
                    
 		   
		   p2= new JPasswordField(10);
                    
                   f= new Font("Segoe UI Symbol",Font.PLAIN,14);


	
 
                   b1= new JButton("Submit");
                   b2= new JButton("cancel");
                   b3= new JButton("Back");
                    
                   l1.setBounds(700,60,120,35);
                   t1.setBounds(850,60,200,20);
                   
                   l2.setBounds(700,120,120,35);
                   t2.setBounds(850,120,200,20);
 	  b3.setBounds(40,40,80,20);
                   l3.setBounds(700,180,120,35);
                   t3.setBounds(850,180,200,20);

                   l4.setBounds(700,240,120,35);
                   t4.setBounds(850,240,200,20);
                    
                      
                    
                   l5.setBounds(700,300,120,35);
                   t5.setBounds(850,300,200,20);
   
                   l6.setBounds(700,360,120,35);
                   t6.setBounds(850,360,200,20);
    
                   l7.setBounds(700,420,120,35);
                   t7.setBounds(850,420,200,20);
 
                   l8.setBounds(700,480,120,35);
                   t8.setBounds(850,480,200,20);
                 
                   l9.setBounds(700,540,120,35);
                   t9.setBounds(850,540,200,20);
		
		   l11.setBounds(300,490,120,40);
		   t10.setBounds(380,500,120,20);
		   
		   l12.setBounds(300,530,120,35);
		   p2.setBounds(380,540,120,20);
                 
                   b1.setBounds(780,620,80,20);
                   b2.setBounds(880,620,80,20);


 		   cb = new JComboBox();
		cb.addItem("Date");
		cb.addItem("1");
		cb.addItem("2");
		cb.addItem("3");
		cb.addItem("4");
		cb.addItem("5");
		cb.addItem("6");
		cb.addItem("7");
		cb.addItem("8");
		cb.addItem("9");
		cb.addItem("10");
		cb.addItem("11");
		cb.addItem("12");
		cb.addItem("13");
		cb.addItem("14");
		cb.addItem("15");
		cb.addItem("16");
		cb.addItem("17");
		cb.addItem("18");
		cb.addItem("19");
		cb.addItem("20");
		cb.addItem("21");
		cb.addItem("22");
		cb.addItem("23");
		cb.addItem("24");
		cb.addItem("25");
		cb.addItem("26");
		cb.addItem("27");
		cb.addItem("28");
		cb.addItem("29");
		cb.addItem("30");
		cb.addItem("31");
		cb.setBounds(850,240,70,20);
		add(cb);
		
		cb1 = new JComboBox();
		cb1.addItem("Month");
		cb1.addItem("January");
		cb1.addItem("February");
		cb1.addItem("March");
		cb1.addItem("April");
		cb1.addItem("May");
		cb1.addItem("June");
		cb1.addItem("July");
		cb1.addItem("August");
		cb1.addItem("September");
		cb1.addItem("Octobor");
		cb1.addItem("November");
		cb1.addItem("December");
		cb1.setBounds(920,240,70,20);
		add(cb1);
		
		cb2=new JComboBox();
		cb2.addItem("Year");
		cb2.addItem("1990");
		cb2.addItem("1991");
		cb2.addItem("1992");
		cb2.addItem("1993");
		cb2.addItem("1994");
		cb2.addItem("1995");
		cb2.addItem("1996");
		cb2.addItem("1997");
		cb2.addItem("1998");
		cb2.addItem("1999");
		cb2.addItem("2000");
		cb2.addItem("2001");
		cb2.addItem("2002");
		cb2.addItem("2003");
		cb2.addItem("2004");
	

		cb2.setBounds(990,240,70,20);
		add(cb2);

                   
 
                   
                  //  add(l10);
                    add(l1);
                    add(l2);
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

                    add(t1);
                    add(t2);
                    add(t3);
                   
                    add(t5);
                    add(t6);
                    add(t7);
                    add(t8);

                    add(t9);
		    add(t10);
                    add(p2); 
                   
                    add(b1);
                    add(b2);
	   add(b3);
                    add(l10);

   		       		                  
                     l1.setFont(f);
                     l2.setFont(f);
                     l3.setFont(f);
                     l4.setFont(f);
                     l5.setFont(f);
                     l6.setFont(f);
                     l7.setFont(f);
                     l8.setFont(f);
                     l9.setFont(f);

                      
                    l1.setForeground(Color.white);
                    l2.setForeground(Color.white);
                    l3.setForeground(Color.white);
                    l4.setForeground(Color.white);
                    l5.setForeground(Color.white);
                    l6.setForeground(Color.white);
                    l7.setForeground(Color.white);
                    l8.setForeground(Color.white);
                    l9.setForeground(Color.white);

  		l11.setForeground(Color.white);
		l12.setForeground(Color.white);

                   t1.setFont(f);
                   t2.setFont(f);
                   t3.setFont(f);
                   t4.setFont(f);
                   t5.setFont(f);
                   t6.setFont(f);
                   t7.setFont(f);
                   t8.setFont(f);
                   t9.setFont(f);
    

                   b1.setFont(f);
                   b2.setFont(f);

                   t1.setForeground(Color.black);
                   t2.setForeground(Color.black);
                   t3.setForeground(Color.black);
                   t4.setForeground(Color.black);
                   t5.setForeground(Color.black);
                   t6.setForeground(Color.black);
                   t7.setForeground(Color.black);
                   t8.setForeground(Color.black);
                   t9.setForeground(Color.black);
setSize(1120,700);
                   
		//setLocation(10,10);
		   
                    l10.setBounds(0,0,1368,768);

                  setSize(1368,768);
                   
                    
	 b3.addActionListener(this);
                    b1.addActionListener(this);
                    b2.addActionListener(this);

                    
                                 
                     
                     
                     setVisible(true);
 
                     }
                     public void actionPerformed(ActionEvent ae)
                     {
                        
                         Object o = ae.getSource();

		 if(o==b3)
		{
		this.dispose();
		new login();
		}
                         if(o==b1)
                       {
	           this.dispose();
		new homepage();
                       }
                         
                         if(o==b2)
                       {
                         
                           System.exit(0);
                        }
                         }
                     
                  


                    public static void main(String args[])

                   {
                       new register();
                         
                   }


}




















                             
 
                   