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