//package MovieTicket;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ShowsMovie1Frame extends JFrame
{
	Label ttl1,lthr1,lthr2,lthr3,lthr4;
	JButton bShow1,bShow2,bShow3,bShow4,bShow5,bShow6,bShow7,bShow8,bShow9;
	Font f1,f2;
	MyActionListener ml = new MyActionListener(this);
	
	ShowsMovie1Frame()
	{
		super("Showtimings for KGF 2");
		setLayout(null);
		setBounds(0,0,1200,900);
		getContentPane().setBackground(Color.GRAY);
		
		ttl1 = new Label("Showtimings for KGF movie:");
		ttl1.setBounds(100,70,450,80);
		
		lthr1 = new Label("R World:");
		lthr1.setBounds(100,180,100,40);
		
		lthr2 = new Label("Cosmoplex:");
		lthr2.setBounds(100,320,140,40);
		
		lthr3 = new Label("Galaxy Cinema:");
		lthr3.setBounds(100,460,200,40);
		
		lthr4 = new Label("Rajshree:");
		lthr4.setBounds(100,600,200,40);
		
		bShow1 = new JButton("11:00");
		bShow1.setBounds(100,220,100,50);
		
		bShow2 = new JButton("4:30");
		bShow2.setBounds(270,220,100,50);
		
		bShow3 = new JButton("1:00");
		bShow3.setBounds(100,360,100,50);
		
		bShow4 = new JButton("09:30");
		bShow4.setBounds(100,500,100,50);
		
		bShow5 = new JButton("8:00");
		bShow5.setBounds(270,360,100,50);
		
		bShow6 = new JButton("9:30");
		bShow6.setBounds(100,640,100,50);
		
		bShow7 = new JButton("4:30");
		bShow7.setBounds(270,640,100,50);
		
		bShow8 = new JButton("10:30");
		bShow8.setBounds(440,220,100,50);
		
		add(ttl1);
		add(lthr1);
		add(lthr2);
		add(lthr3);
		add(lthr4);
		add(bShow1);
		add(bShow2);
		add(bShow3);
		add(bShow4);
		add(bShow5);
		add(bShow6);
		add(bShow7);
		add(bShow8);
		
		f1 = new Font("Times",Font.BOLD,25);
		ttl1.setFont(f1);
		lthr1.setFont(f1);
		lthr2.setFont(f1);
		lthr3.setFont(f1);
		lthr4.setFont(f1);
		bShow1.setFont(f1);
		bShow2.setFont(f1);
		bShow3.setFont(f1);
		bShow4.setFont(f1);
		bShow5.setFont(f1);
		bShow6.setFont(f1);
		bShow7.setFont(f1);
		bShow8.setFont(f1);
		
		bShow1.setBackground(Color.LIGHT_GRAY);
		bShow2.setBackground(Color.LIGHT_GRAY);
		bShow3.setBackground(Color.LIGHT_GRAY);
		bShow4.setBackground(Color.LIGHT_GRAY);
		bShow5.setBackground(Color.LIGHT_GRAY);
		bShow6.setBackground(Color.LIGHT_GRAY);
		bShow7.setBackground(Color.LIGHT_GRAY);
		bShow8.setBackground(Color.LIGHT_GRAY);
		
		bShow1.addActionListener(ml);
		bShow2.addActionListener(ml);
		bShow3.addActionListener(ml);
		bShow4.addActionListener(ml);
		bShow5.addActionListener(ml);
		bShow6.addActionListener(ml);
		bShow7.addActionListener(ml);
		bShow8.addActionListener(ml);
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
	}
}