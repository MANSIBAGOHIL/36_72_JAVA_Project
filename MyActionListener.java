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
	MovieListFrame mf;
	RWorldFrame rf;
	CosmoplexFrame csf;
	RajshreeFrame rjf;
	GalaxyCinemaFrame gcf;
	Movie3Frame df;
	Kgf2MovieFrame kf;
	JayeshbhaiMovieFrame jf;
	Bb2MovieFrame bb2;
	ShowsDhaakadFrame sd;
	ShowsMovie1Frame sm1;
	ShowsMovie2Frame kgf;
	ShowsMovie4Frame sm4;
	Screen1Movie3 st1;
	
	MyActionListener(WelcomeFrame w)
	{
		this.wf = w;
	}
	MyActionListener(CinemaListFrame c)
	{
		this.cf = c;
	}
	MyActionListener(MovieListFrame m)
	{
		this.mf = m;
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
	MyActionListener(Movie3Frame d)
	{
		this.df = d;
	}	
	MyActionListener(Kgf2MovieFrame k)
	{
		this.kf = k;
	}	
	MyActionListener(JayeshbhaiMovieFrame j)
	{
		this.jf = j;
	}
	MyActionListener(Bb2MovieFrame b)
	{
		this.bb2 = b;
	}
	MyActionListener(ShowsMovie1Frame b)
	{
		this.sm1 = b;
	}
	MyActionListener(ShowsMovie2Frame k)
	{
		this.kgf = k;
	}
	MyActionListener(ShowsDhaakadFrame s)
	{
		this.sd = s;
	}
	MyActionListener(ShowsMovie4Frame j)
	{
		this.sm4 = j;
	}
	MyActionListener(Screen1Movie3 w)
	{
		this.st1 = w;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Theatre name"))
		{
			cf = new CinemaListFrame();
			this.cf.setVisible(true);
			//this.wf.setVisible(false);
		}
		if(e.getActionCommand().equals("Movie Name"))
		{
			mf = new MovieListFrame();
			this.mf.setVisible(true);
			//this.wf.setVisible(false);
		}
		if(e.getActionCommand().equals("Today"))
		{
			jf = new JayeshbhaiMovieFrame();
			this.jf.setVisible(true);
			this.wf.setVisible(false);
		}
		if(e.getActionCommand().equals("Dhaakad"))
		{
			df = new Movie3Frame();
			this.df.setVisible(true);
			this.mf.setVisible(false);
		}
		if(e.getActionCommand().equals("K.G.F: Chapter 2"))
		{
			kf = new Kgf2MovieFrame();
			this.kf.setVisible(true);
			this.mf.setVisible(false);
		}
		if(e.getActionCommand().equals("Jayeshbhai Jordaar"))
		{
			jf = new JayeshbhaiMovieFrame();
			this.jf.setVisible(true);
			this.mf.setVisible(false);
		}
		if(e.getActionCommand().equals("Bhool Bhulaiyaa 2"))
		{
			bb2 = new Bb2MovieFrame();
			this.bb2.setVisible(true);
			this.mf.setVisible(false);
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
		if(e.getActionCommand().equals("Book Tickets"))
		{
			sd = new ShowsDhaakadFrame();
			this.sd.setVisible(true);
			this.df.setVisible(false);
		}
		if(e.getActionCommand().equals("Book Tickets for KGF 2"))
		{
			//System.out.println("entered");
			kgf = new ShowsMovie2Frame();
			this.kgf.setVisible(true);
			this.kf.setVisible(false);
		}
		if(e.getActionCommand().equals("Book Tickets for Bhoolbhulaiyaa 2"))
		{
			sm1 = new ShowsMovie1Frame();
			this.sm1.setVisible(true);
			this.bb2.setVisible(false);
		}
		if(e.getActionCommand().equals("Book Tickets for Jayeshbhai Jordaar"))
		{
			sm4 = new ShowsMovie4Frame();
			this.sm4.setVisible(true);
			this.jf.setVisible(false);
		}
		if(e.getActionCommand().equals("1:00"))
		{
			st1 = new Screen1Movie3();
			this.st1.setVisible(true);
			this.sd.setVisible(false);
		}
	}	
}