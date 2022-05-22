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
	RWorldFrame rf;
	CosmoplexFrame csf;
	RajshreeFrame rjf;
	GalaxyCinemaFrame gcf;
	
	MyActionListener(WelcomeFrame w)
	{
		this.wf = w;
	}
	MyActionListener(CinemaListFrame c)
	{
		this.cf = c;
	}
	MyActionListener(RWorldFrame r)
	{
		this.rf = r;
	}
	MyActionListener(CosmoplexFrame cs)
	{
		this.csf = cs;
	}
	MyActionListener(RajshreeFrame rs)
	{
		this.rjf = rs;
	}
	MyActionListener(GalaxyCinemaFrame gf)
	{
		this.gcf = gf;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Theatre name"))
		{
			cf = new CinemaListFrame();
			this.cf.setVisible(true);
			this.wf.setVisible(false);
		}
		if(e.getActionCommand().equals("R World INOX"))
		{
			rf = new RWorldFrame();
			this.rf.setVisible(true);
			this.cf.setVisible(false);
		}
		if(e.getActionCommand().equals("Cosmoplex"))
		{
			csf = new CosmoplexFrame();
			this.csf.setVisible(true);
			this.cf.setVisible(false);
		}
		if(e.getActionCommand().equals("Rajshree"))
		{
			rjf = new RajshreeFrame();
			this.rjf.setVisible(true);
			this.cf.setVisible(false);
		}
		if(e.getActionCommand().equals("Galaxy Cinema"))
		{
			gcf = new GalaxyCinemaFrame();
			this.gcf.setVisible(true);
			this.cf.setVisible(false);
		}
	}	
}