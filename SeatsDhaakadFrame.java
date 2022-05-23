//package MovieTicket;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SeatsDhaakadFrame extends JFrame
{
	Label ttl1,lthr1,lthr2,lthr3,lthr4;
	JButton bShow1,bShow2,bShow3,bShow4,bShow5;
	Font f1,f2;
	MyActionListener ml = new MyActionListener(this);
	
	SeatsDhaakadFrame()
	{
		super("Showtimings for Dhaakad");
		setLayout(null);
		setBounds(0,0,1200,900);
		getContentPane().setBackground(Color.GRAY);
		
		ttl1 = new Label("Showtimings for Dhaakad movie:");
		ttl1.setBounds(100,70,450,80);
		
		lthr1 = new Label("R World:");
		lthr1.setBounds(100,180,100,40);
		
		lthr2 = new Label("Cosmoplex:");
		lthr2.setBounds(100,320,140,40);
		
		lthr3 = new Label("Galaxy Cinema:");
		lthr3.setBounds(100,460,200,40);
		
		bShow1 = new JButton("10:10");
		bShow1.setBounds(100,220,100,50);
		
		bShow2 = new JButton("4:15");
		bShow2.setBounds(270,220,100,50);
		
		bShow3 = new JButton("1:00");
		bShow3.setBounds(100,360,100,50);
		
		bShow4 = new JButton("9:30");
		bShow4.setBounds(100,500,100,50);
		
		bShow5 = new JButton("7:20");
		bShow5.setBounds(270,500,100,50);
		
		add(ttl1);
		add(lthr1);
		add(lthr2);
		add(lthr3);
		add(bShow1);
		add(bShow2);
		add(bShow3);
		add(bShow4);
		add(bShow5);
		
		f1 = new Font("Times",Font.BOLD,25);
		ttl1.setFont(f1);
		lthr1.setFont(f1);
		lthr2.setFont(f1);
		lthr3.setFont(f1);
		bShow1.setFont(f1);
		bShow2.setFont(f1);
		bShow3.setFont(f1);
		bShow4.setFont(f1);
		bShow5.setFont(f1);
		
		bShow1.setBackground(Color.LIGHT_GRAY);
		bShow2.setBackground(Color.LIGHT_GRAY);
		bShow3.setBackground(Color.LIGHT_GRAY);
		bShow4.setBackground(Color.LIGHT_GRAY);
		bShow5.setBackground(Color.LIGHT_GRAY);
		
		bShow1.addActionListener(ml);
		bShow2.addActionListener(ml);
		bShow3.addActionListener(ml);
		bShow4.addActionListener(ml);
		bShow5.addActionListener(ml);
		
		addWindowListener(new WindowAdapter()
			{
				//use closing method Not Closed
				public void windowClosing(WindowEvent e)
				{
					System.exit(0);
				}
			});
	}
	public static void main(String args[])
	{
		SeatsDhaakadFrame sdf = new SeatsDhaakadFrame();
		sdf.setVisible(true);
	}
}