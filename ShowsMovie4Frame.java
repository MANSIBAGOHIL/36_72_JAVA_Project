//package MovieTicket;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ShowsMovie4Frame extends JFrame
{
	Label ttl1,lthr1,lthr2;
	JButton bShow1,bShow2,bShow3;
	Font f1,f2;
	MyActionListener ml = new MyActionListener(this);
	
	ShowsMovie4Frame()
	{
		super("Showtimings for KGF 2");
		setLayout(null);
		setBounds(0,0,1200,900);
		getContentPane().setBackground(Color.GRAY);
		
		ttl1 = new Label("Showtimings for KGF movie:");
		ttl1.setBounds(100,70,450,80);
		
		lthr1 = new Label("R World:");
		lthr1.setBounds(100,180,100,40);
		
		lthr2 = new Label("Galaxy Cinema:");
		lthr2.setBounds(100,320,190,40);
		
		bShow1 = new JButton("11:00");
		bShow1.setBounds(100,220,100,50);
		
		bShow2 = new JButton("4:30");
		bShow2.setBounds(270,220,100,50);
		
		bShow3 = new JButton("09:30");
		bShow3.setBounds(100,360,100,50);
		
		add(ttl1);
		add(lthr1);
		add(lthr2);
		add(bShow1);
		add(bShow2);
		add(bShow3);
		
		f1 = new Font("Times",Font.BOLD,25);
		ttl1.setFont(f1);
		lthr1.setFont(f1);
		lthr2.setFont(f1);
		bShow1.setFont(f1);
		bShow2.setFont(f1);
		bShow3.setFont(f1);
		
		bShow1.setBackground(Color.LIGHT_GRAY);
		bShow2.setBackground(Color.LIGHT_GRAY);
		bShow3.setBackground(Color.LIGHT_GRAY);
		
		bShow1.addActionListener(ml);
		bShow2.addActionListener(ml);
		bShow3.addActionListener(ml);
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
	}
}