package MyPack;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class User1 implements ActionListener
{
	JFrame F;
	JPanel p1,p2;
	JButton B1;
	JButton B2;
	JButton B3;
	JTextField T1,T2;
	JLabel L1,L2;
	
	User1()
	{
		F= new JFrame(" USER SCETION ");
		B1=new JButton();
		B2=new JButton();
		B3=new JButton();
		
		B1.setText("BOOK TICKET");
		B1.addActionListener(this);
		
		
		B2.setText("CANCEL TICKET");
		B2.addActionListener(this);
		
		
		B3.setText("BACK");
		B3.addActionListener(this);
		
		F.getContentPane().setBackground(Color.PINK);
		
		B1.setBackground(Color.MAGENTA);
		B2.setBackground(Color.MAGENTA);
		B3.setBackground(Color.MAGENTA);
		F.setLayout(new FlowLayout());
		F.setSize(300,300);
		F.setVisible(true);
		
		
		Font f2=new Font("TimesRoman",Font.BOLD,15);
		
		L1=new JLabel("NO SEATS TO BE BOOKED :");
		T1=new JTextField(5);
		
		L2=new JLabel("NO SEATS TO BE CANCELLED :");
		T2=new JTextField(5);
		
		p1=new JPanel(new GridBagLayout());
		GridBagConstraints c2=new GridBagConstraints();
				                                                                //       column
		c2.insets=new Insets(0,20,0,0);                                //         0  1   2   
		c2.anchor=GridBagConstraints.LINE_START; 

		c2.gridx=0;c2.gridy=0;p1.add(L1,c2);                    
		c2.gridx=1;c2.gridy=0;p1.add(T1,c2);
		c2.gridx=0;c2.gridy=1;p1.add(L2,c2);                    
		c2.gridx=1;c2.gridy=1;p1.add(T2,c2);
		
		p1.setBounds(450, 260, 500, 50);
		p1.setBackground(Color.PINK);
		F.add(p1);
		F.add(B1);
		F.add(B2);
		F.add(B3);
		
		
	}
	
	 void bookticket()
	{
		//System.out.println("Flora");

		for(Details d1 : information.CA) 

		{String no = JOptionPane.showInputDialog("ENTER FLIGHT NO:");
			
			if (d1.getFno() ==Integer.valueOf(no))
			{	 
					 d1.setSt(d1.getSt() -Integer.parseInt(T1.getText()) );
					 d1.setReg(Integer.parseInt(T1.getText()));
				 	 T1.setText("");
		 		 	 JOptionPane.showMessageDialog(null, "SUCCESSFULLY BOOKED ",null,JOptionPane.INFORMATION_MESSAGE ); 
					 
				 }
				 else {
					 
					 JOptionPane.showMessageDialog(null, "check your flight number ",null,JOptionPane.INFORMATION_MESSAGE );
				 }
	}
	}
	
	
	 void cancel()
	{
		 //System.out.println("Flora");
		for(Details d1 : information.CA) 

		{String no = JOptionPane.showInputDialog("ENTER FLIGHT NO:");
			
			if (d1.getFno() ==Integer.valueOf(no))
			{
				 
					 d1.setSt(d1.getSt() +Integer.parseInt(T2.getText()) );
					 d1.setCan(Integer.parseInt(T2.getText()));
					 T2.setText("");
		 		 	 JOptionPane.showMessageDialog(null, "SUCCESSFULLY CANCELLED ",null,JOptionPane.INFORMATION_MESSAGE ); 
				 
				 }
				 else {
					 
					 JOptionPane.showMessageDialog(null, "check your flight number ",null,JOptionPane.INFORMATION_MESSAGE );
				 }
	}
		
	}
	public void actionPerformed(ActionEvent e)
	{
  JButton B = (JButton)e.getSource();
		
		if(B.getActionCommand().equals("BOOK TICKET"))
		{
			bookticket();
	    }
	
		if(B.getActionCommand().equals("CANCEL TICKET"))
		{
			cancel();
		
	    }
	
		if(B.getActionCommand().equals("BACK"))
		{
			new App();
		
	    }
	
	
	}
	
	public static void main(String...g)
	{
		//new User1();
	}
}
	
	

