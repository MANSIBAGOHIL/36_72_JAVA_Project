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
	SeatsDhaakadFrame sd;
	DhaakadMovieFrame df;
	Kgf2MovieFrame kf;
	JayeshbhaiMovieFrame jf;
	Bb2MovieFrame bb2;
	
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
	MyActionListener(DhaakadMovieFrame d)
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
	MyActionListener(SeatsDhaakadFrame s)
	{
		this.sd = s;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Theatre name"))
		{
			cf = new CinemaListFrame();
			this.cf.setVisible(true);
			this.wf.setVisible(false);
		}
		if(e.getActionCommand().equals("Movie Name"))
		{
			mf = new MovieListFrame();
			this.mf.setVisible(true);
			this.wf.setVisible(false);
		}
		if(e.getActionCommand().equals("Today"))
		{
			jf = new JayeshbhaiMovieFrame();
			this.jf.setVisible(true);
			this.wf.setVisible(false);
		}
		if(e.getActionCommand().equals("Dhaakad"))
		{
			df = new DhaakadMovieFrame();
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
			bb2 = new Bb2MovieFrame();
			this.bb2.setVisible(true);
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
	}	
}