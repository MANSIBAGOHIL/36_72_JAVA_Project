//package MovieTicket;

//import java.awt.*;
import java.awt.event.*;
//import java.io.*;
//import javax.swing.*;
//import java.lang.*;

public class MyActionListener implements ActionListener
{
	WelcomeFrame wf;
	CinemaListFrame cf;
	
	MyActionListener(WelcomeFrame w)
	{
		this.wf = w;
	}
	MyActionListener(CinemaListFrame c)
	{
		this.cf = c;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Theatre name"))
		{
			cf = new CinemaListFrame();
			this.cf.setVisible(true);
			this.wf.setVisible(false);
		}
	}	
}