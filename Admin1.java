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

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Admin1
{
public static void main(String...g)
{
new Admin();	
}
}
class information  implements ActionListener
{
	  
	 public static ArrayList<Details> CA;
	 JFrame f;
	 JLabel L;
	 JLabel L1;
	 JLabel L2,L3,L4,L5,L6,L7;
	
	 JTextField T1,T2,T3,T4,T5,T6,T7;
	 
	 JButton b1,b2;
	 JPanel p1,p2;

		static 
		{
			CA = new ArrayList<Details>(); 
		}
	
	public  information() 
	{
		f=new JFrame("Information");
		f.setContentPane(new JLabel(new ImageIcon("C:\\Users\\god\\Pictures\\download15.jpg")));
		L=new JLabel("ADD FLIGHT INFORMATION:");
		L1=new JLabel("Flight number");
		L2=new JLabel("Flight name");
		L3=new JLabel("Departure Date");
		L4=new JLabel("Arrival Date");
		L5=new JLabel("Destination Place");
		L6=new JLabel("Orgin Place");
		L7=new JLabel("Number of seats");
	
		T1=new JTextField(15);
		T2=new JTextField(15);
		T3 = new JTextField(15);
		T4=new JTextField(15);
		T5=new JTextField(15);
		T6=new JTextField(15);
		T7=new JTextField(15);
		
		b1 =new JButton("Create");
		b2=new JButton("BACK");
		
		
		p1=new JPanel(new GridBagLayout());
		GridBagConstraints c1=new GridBagConstraints();                                 
		c1.anchor=GridBagConstraints.LINE_START;  
	
		
		c1.gridx=0;c1.gridy=0;p1.add(L1,c1);                    
		c1.gridx=1;c1.gridy=0;p1.add(T1,c1);
		c1.gridx=0;c1.gridy=1;p1.add(L2,c1);
		c1.gridx=1;c1.gridy=1;p1.add(T2,c1);
		c1.gridx=0;c1.gridy=2;p1.add(L3,c1);
		c1.gridx=1;c1.gridy=2;p1.add(T3,c1);
		c1.gridx=0;c1.gridy=3;p1.add(L4,c1);
		c1.gridx=1;c1.gridy=3;p1.add(T4,c1);
		
		c1.gridx=0;c1.gridy=4;p1.add(L5,c1);
		c1.gridx=1;c1.gridy=4;p1.add(T5,c1);
		c1.gridx=0;c1.gridy=5;p1.add(L6,c1);
		c1.gridx=1;c1.gridy=5;p1.add(T6,c1);
		c1.gridx=0;c1.gridy=6;p1.add(L7,c1);
		c1.gridx=1;c1.gridy=6;p1.add(T7,c1);
		
		c1.gridx=1;c1.gridy=7;p1.add(b1,c1);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	
		
		f.setLayout(new FlowLayout());		
		f.add(p1);
		f.add(b2);
		f.setVisible(true);
		f.setSize(300,260);
	}

	
	public void  insertcustomer(int flno,String flnm,long dpdt,long ardt,String dspl,String orpl,int sea)
	{
		Details d = new Details();
		d.setFno(flno);
		d.setFnm(flnm);
		d.setDdt(dpdt);
		d.setAdt(ardt);
		d.setDpl(dspl);
		d.setOpl(orpl);
		d.setSt(sea);
		
		CA.add(d);
		System.out.println(d);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		
        JButton B = (JButton)e.getSource();

		if(B.getActionCommand().equals("Create"))
	
		{
			int flno;
			String flnm;
			long dpdt;
			long ardt;
			String dspl;
			String orpl;
			int sea;
			
			 flno = Integer.parseInt(T1.getText());
			 flnm = T2.getText();
			 dpdt = Long.parseLong(T3.getText());
			 ardt = Long.parseLong(T4.getText());
			 dspl = T5.getText();
			 orpl = T6.getText();
			 sea = Integer.parseInt(T7.getText());
		
			 
		 insertcustomer(flno,flnm,dpdt,ardt,dspl,orpl,sea);
		
			 T1.setText("");
			 T2.setText("");
			 T3.setText("");
			 T4.setText("");
			 T5.setText("");
			 T6.setText("");
			 T7.setText("");
			 		 						
		}
		
		if(B.getActionCommand().equals("BACK"))
		{
			new Admin();	
		}
		
	}
		
	}
class FlightDetails extends information{
	
	
	FlightDetails(){
		
		this.f.dispose();
		
		b1 =new JButton();
		JScrollPane jsp;
		JTable t;
		
		f = new JFrame("Customer Details");
		p1 = new JPanel();
		
		   p1.setBounds(20, 100,1240,450);
		   p1.setLayout(null);		
	  
	   
	   
		String colmn[] ={"S.No","Flight number","Flight Name","Departure date","Arrival date","Destination Place","Orgin place","No of seats","Book ticket","cancel ticket"
				};
		String data[][] = new String[10][13];
		
		int i=0;
		
		for(Details d1 : CA)
		{	
			data[i][0] = Integer.toString(i+1);
			data[i][1] = Integer.toString(d1.getFno());
			data[i][2] = d1.getFnm();
			data[i][3] = Long.toString(d1.getDdt());
			data[i][4] = Long.toString(d1.getAdt());
			data[i][5] = d1.getDpl();
			data[i][6] = d1.getOpl();
			data[i][7] = Integer.toString(d1.getSt());
			data[i][8] = Integer.toString(d1.getReg());
			data[i][9] = Integer.toString(d1.getCan());
			
			i++;	
		}
		
		t=new JTable(data,colmn);
		jsp=new JScrollPane(t); 
		p1.add(jsp);
		jsp.setBounds(0, 0, 1000, 375);
		
		
		b1.setText("BACK");
		b1.addActionListener(this);
		
		f.setLayout(null);		
		f.setSize(1000, 375);				
		f.setVisible(true);
		f.add(p1);
		f.add(b1);
		
	}
	
public void actionPerformed(ActionEvent e) {
		
		JButton B = (JButton)e.getSource();
			
			
		if(B.getActionCommand().equals("BACK"))
		 {
				new Admin();
		}
		
		if(B.getActionCommand().equals("create"))
		 {
				new information();
		}
	    
}
}


