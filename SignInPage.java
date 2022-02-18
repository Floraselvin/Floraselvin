package MyPack;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 public class SignInPage implements ActionListener 
{
	JFrame F;
	JTextField T1,T2,T3,T4,T5;
	JLabel L1,L2,L3,L4,L5,I;
	JButton B1;
	GridBagConstraints g;
	JPanel P;
	
	
	SignInPage()
	{
	
		F = new JFrame(" Sign In ");
	    g = new GridBagConstraints();  
		
		
	    F.setContentPane(new JLabel(new ImageIcon("C:\\Users\\god\\Pictures\\download7.jpg")));
		F.setLayout(new FlowLayout());
		I=new JLabel();
		F.add(I);
	    
		L1 = new JLabel("User Name ");
		L2 = new JLabel("Email Id : ");
		L3 = new JLabel("Password : ");
		L5 = new JLabel("");
		
		T1 =  new JTextField(10);
		T2 =  new JTextField(10);
		T3 =  new JPasswordField(10);
		T4 =  new JPasswordField(10);
		T1.setBackground(Color.PINK);
		T2.setBackground(Color.PINK);
		T3.setBackground(Color.PINK);
		

		
		
		B1 = new JButton(" SIGN IN ");
		
		F.setLayout(new GridBagLayout());
		
		g.gridx = 0;  
	    g.gridy = 0;  
	    F.add(L1, g);  
	    	    
	    g.gridx = 1;  // col  
	    g.gridy = 0;  //row
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
	    g.gridy = 4;  
	    F.add(L5, g);
	     
	    g.gridx = 1;  
	    g.gridy = 4;  
	    F.add(B1, g);
	
	    B1.addActionListener(this);
	    B1.setBackground(Color.YELLOW);
	    
	    F.setSize(400, 250);					
		F.setVisible(true);
	
	}     
	
	

	public void actionPerformed(ActionEvent e)
	{
		JButton B = (JButton)e.getSource();
		

		if(B.getActionCommand().equals(" SIGN IN "))
		
		{String User=T1.getText();
		String password=T3.getText();
		if(User.equals("Airline")&&password.equals("0000"))
		{
			new Admin();
		}
			
			
		}
		
		}
	}



