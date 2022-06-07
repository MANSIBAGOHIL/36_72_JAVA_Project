//package MovieTicket;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Screen1Movie3 extends JFrame
{
	JButton bb1;
	JToggleButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
	Font f1;
	MyActionListener ml = new MyActionListener(this);
	
	Screen1Movie3()
	{
		super("Screen 1:");
		setLayout(null);
		setBounds(0,0,1200,900);
		getContentPane().setBackground(Color.GRAY);
		
		f1 = new Font("Arial",Font.PLAIN,20);
		
		bb1 = new JButton("continue booking");
		bb1.setBounds(800,700,300,50);
		add(bb1);
		bb1.setFont(f1);
		bb1.addActionListener(ml);
		
		b0 = new JToggleButton();
		b0.setBounds(300,100,100,50);
		add(b0);
		b0.addActionListener(ml);
		
		b1 = new JToggleButton();
		b1.setBounds(500,100,100,50);
		add(b1);
		b1.addActionListener(ml);
		
		b2 = new JToggleButton();
		b2.setBounds(200,250,100,50);
		add(b2);
		b2.addActionListener(ml);
		
		b3 = new JToggleButton();
		b3.setBounds(400,250,100,50);
		add(b3);
		b3.addActionListener(ml);
		
		b4 = new JToggleButton();
		b4.setBounds(600,250,100,50);
		add(b4);
		b4.addActionListener(ml);
		
		b5 = new JToggleButton();
		b5.setBounds(300,400,100,50);
		add(b5);
		b5.addActionListener(ml);
		
		b6 = new JToggleButton();
		b6.setBounds(500,400,100,50);
		add(b6);
		b6.addActionListener(ml);
		
		b7 = new JToggleButton();
		b7.setBounds(200,550,100,50);
		add(b7);
		b7.addActionListener(ml);
		
		b8 = new JToggleButton();
		b8.setBounds(400,550,100,50);
		add(b8);
		b8.addActionListener(ml);
		
		b9 = new JToggleButton();
		b9.setBounds(600,550,100,50);
		add(b9);
		b9.addActionListener(ml);
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
	}	
}