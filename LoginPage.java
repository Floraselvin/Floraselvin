package MyPack;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 public class LoginPage implements ActionListener 
{
	JFrame F;
	JTextField T1,T2,T3;
	JLabel L1,L2,L3,L4,I;
	JButton B1;
	GridBagConstraints g;
	
	
	
	 LoginPage()
	{	
		 
		F = new JFrame(" Login ");
	    g = new GridBagConstraints();  
		
	    F.setContentPane(new JLabel(new ImageIcon("C:\\Users\\god\\Pictures\\download7.jpg")));
		F.setLayout(new FlowLayout());
		I=new JLabel();
		F.add(I);
		
		L1 = new JLabel();
		L2 = new JLabel();
		L3 = new JLabel();
		L4 = new JLabel();
		
		T1 =  new JTextField(10);
		T2 =  new JTextField(10);
		T3 =  new JPasswordField(10);
		
		
		B1 = new JButton(" LOGIN ");
		
		F.setLayout(new GridBagLayout());
		
		g.gridx = 0;  
	    g.gridy = 0;  
	    F.add(L1, g);  
	    	    
	    g.gridx = 1;   
	    g.gridy = 0;  
	    F.add(T1, g);
	    
	    g.gridx = 0;  
	    g.gridy = 1;  
	    F.add(L2, g);
	    
	    g.gridx = 1;  
	    g.gridy = 1;  
	    F.add(T2, g);
	    
	    g.gridx = 0;  
	    g.gridy = 2;  
	    F.add(L3, g);
	    
	    g.gridx = 1;  
	    g.gridy = 2;  
	    F.add(T3, g);
	    
	    g.gridx = 0;  
	    g.gridy = 3;  
	    F.add(L4, g);
	     
	    g.gridx = 1;  
	    g.gridy = 3;  
	    F.add(B1, g);
	
	    B1.addActionListener(this);
	    B1.setBackground(Color.YELLOW);
	    
	    F.setSize(400, 250);					
		F.setVisible(true);
	
	}
	 
	 public void three()
		{
			L1.setText("User Name :");
			L2.setText("Email Id :" );
			L3.setText("Password :" );	
			L4.setText("");
		}	
	public void actionPerformed(ActionEvent e)
	{
		

		JButton B = (JButton)e.getSource();
		
		if(B.getActionCommand().equals(" LOGIN "))
			{
			
			
				new User1();
			}

		
	}
	
}


