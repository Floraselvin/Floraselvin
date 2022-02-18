package MyPack;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon;


class one implements ActionListener
{
JFrame F;
JButton B1,B2,B3;
JLabel L,L1,L2;
JLabel I;
JPanel P,P1,P2,P3;

one()
{
	F = new JFrame("Airline Reservation System");
	
	F.setContentPane(new JLabel(new ImageIcon("C:\\Users\\god\\Pictures\\download2.jpg")));
	F.setLayout(new FlowLayout());
	I=new JLabel();
	F.add(I);
	F.setSize(300,300);
	
	
	P = new JPanel();
	P.setBackground(Color.WHITE);
	P.setLayout(new FlowLayout(FlowLayout.CENTER));
	
	P1 = new JPanel();
	P1.setBackground(Color.GREEN);
	P1.setLayout(new FlowLayout(FlowLayout.CENTER));
	
	P2 = new JPanel();
	P2.setLayout(new FlowLayout(FlowLayout.CENTER));
	
	B1 = new JButton(" Login ");
	B2 = new JButton(" Admin ");
	B3 = new JButton(" Services ");
	
	
	L = new JLabel("AIRLINE RESERVATION SYSTEM");
	L1= new JLabel();
	L1.setText("  PLEASE LOGIN   " );
	
	B1.addActionListener(this);
	B2.addActionListener(this);
	B3.addActionListener(this);
	
	
	B1.setBackground(Color.PINK);
	B2.setBackground(Color.PINK);
	B3.setBackground(Color.PINK);
	
	
	F.add(P);
	F.add(P2);
	F.add(P1);
	
	P.add(L);
	P2.add(L1);
	P1.add(B1);
	P1.add(B2);
	P1.add(B3);
	
	
	
	F.setSize(300, 300);		
	F.setLayout(new FlowLayout(FlowLayout.CENTER));
	F.setVisible(true);
}

public void actionPerformed(ActionEvent e) 
{
	
	JButton B = (JButton)e.getSource();
	
	if(B.getActionCommand().equals(" Login "))
		{
			
			new LoginPage().three();
		}
	
	else if (B.getActionCommand().equals(" Admin "))
	{
			
			new SignInPage();
	}
	
	else if (B.getActionCommand().equals(" Services "))
	{
		//new FlightDetails();	
	}
	
	
}
}
public class App 
{
    public static void main( String[] args )
    {
    	new one();
    }
}
