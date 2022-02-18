package MyPack;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Admin implements ActionListener
{
	JFrame f;
	JPanel P;
	JButton B1;
	JButton B2;
	JButton B3;
	JLabel label,I;
	Admin()
	{
		
		f = new JFrame(" ADMIN SECTION ");
		f.setContentPane(new JLabel(new ImageIcon("C:\\Users\\god\\Pictures\\download1.jpg")));
		f.setLayout(new FlowLayout());
		I=new JLabel();
		f.add(I);
		
		label=new JLabel();
		P=new JPanel() ; 
		B1=new JButton();
		B2=new JButton();
		B3=new JButton();
	
		
		
		B1.setText("ADD INFO");
		B1.addActionListener(this);
		
		
		B2.setText("DETAILS");
		B2.addActionListener(this);
		
		
		B3.setText("BACK");
		B3.addActionListener(this);
		
		
		label.setText("OFFICE USE");
		
		
		f.add(label);
		f.add(P);
		P.add(B1);
		P.add(B2);
		P.add(B3);
		
		
		
		f.setSize(300,300);
		f.setVisible(true);
		
	
		
	}
	public void actionPerformed(ActionEvent e) {
		
JButton B = (JButton)e.getSource();
		
		if(B.getActionCommand().equals("ADD INFO"))
		{
			new information();
			
		} 
		else if(B.getActionCommand().equals("BACK"))
		{
			new App();
		}
       else if(B.getActionCommand().equals("DETAILS"))
       {
    	   new FlightDetails();
		}
		
	}

}
