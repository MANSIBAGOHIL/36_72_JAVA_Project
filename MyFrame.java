//package MovieTicket;

import java.awt.*;
import java.awt.event.*;
import java.awt.AWTEvent.*;
public class MyFrame extends Frame
{
	MenuBar mb1;
	Menu m1,m2,m3;
	MenuItem mi1,mi2,mi3;
	Font f1,f2;
	
	MyActionListener ml = new MyActionListener(this);
	
	MyFrame()
	{
		super("Online Movie Ticket Booking");
		setLayout(null);
		this.setBounds(0,0,1200,800);
		
		//initialize 
		mb1 = new MenuBar();
		m1 = new Menu("Movie");
		m2 = new Menu("Cinema name");
		m3 = new Menu("Show Timings");
		mi1 = new MenuItem("Today");
		mi2 = new MenuItem("Day");
		mi3 = new MenuItem("Week");
		
		f1 = new Font("Times",Font.BOLD,50);
		f2 = new Font("Times",Font.BOLD,17);
		
		//set Font
		m1.setFont(f2);
		m2.setFont(f2);
		m3.setFont(f2);
		mi1.setFont(f2);
		mi2.setFont(f2);
		mi3.setFont(f2);
		
		mb1.add(m1);
		mb1.add(m2);
		mb1.add(m3);
		m3.add(mi1);
		m3.add(mi2);
		m3.add(mi3);
		setMenuBar(mb1);
		
		mi1.addActionListener(ml);
		mi2.addActionListener(ml);
		mi3.addActionListener(ml);
	
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
		MyFrame mf = new MyFrame();
		mf.setVisible(true);
	}
}