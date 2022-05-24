//package MovieTicket;

import java.net.URL;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class JayeshbhaiMovieFrame extends Frame
{
	JLabel lPic,lName,lGenre,lLenght,lType,lLanguage,lAbout,lDiscribtion,lDiscribtion1,lDiscribtion2,lDiscribtion3,lAvailableShow;
	Button bInox,bGalaxy;
	
	MyActionListener al = new MyActionListener(this);
	
	JayeshbhaiMovieFrame()
	{
		super("Jayeshbhai Jordaar");
		this.setBounds(0, 0, 1200, 800);
		setLayout(null);
		
		Font f1 = new Font("Arial",Font.BOLD,35);
		Font f2 = new Font("SANS_SERIF",Font.PLAIN,30);
		Font f3 = new Font("Arial",Font.PLAIN,20);
		
	
		ImageIcon jj = new ImageIcon("jj.jpg");
		lPic = new JLabel(jj);
		lPic.setBounds(20,30,jj.getIconWidth(),jj.getIconHeight());
		lPic.setVisible(true);
		add(lPic);

		lName = new JLabel("Jayeshbhai Jordaar");
		lName.setBounds(300,30,300,50);
		lName.setFont(f2);
		add(lName);
		
		lGenre = new JLabel("Comedy, Drama");
		lGenre.setBounds(300,90,300,50);
		lGenre.setFont(f2);
		add(lGenre);		
		
		lType = new JLabel("2D");
		lType.setBounds(300,150,300,50);
		lType.setFont(f2);
		add(lType);
		
		lLenght = new JLabel("2h 1m");
		lLenght.setBounds(300,210,300,50);
		lLenght.setFont(f2);
		add(lLenght);		
		
		lLanguage = new JLabel("Hindi");
		lLanguage.setBounds(300,270,300,50);
		lLanguage.setFont(f2);
		add(lLanguage);	
		
		lAbout = new JLabel("About Movie:");
		lAbout.setBounds(600,30,500,50);
		lAbout.setFont(f1);
		add(lAbout);		
		
		lDiscribtion = new JLabel("A timid Jayesh must defy his patriarchal family as he");
		lDiscribtion.setBounds(600,80,500,40);
		lDiscribtion.setFont(f3);
		add(lDiscribtion);
		
		lDiscribtion1 = new JLabel("flees with his wife to save their unborn daughter from");
		lDiscribtion1.setBounds(600,130,500,40);
		lDiscribtion1.setFont(f3);
		add(lDiscribtion1);
		
		lDiscribtion2 = new JLabel("foeticide.");
		lDiscribtion2.setBounds(600,180,500,40);
		lDiscribtion2.setFont(f3);
		add(lDiscribtion2);		
	
		
		lAvailableShow = new JLabel("Available in Following Cinemas:");
		lAvailableShow.setBounds(20,450,700,40);
		lAvailableShow.setFont(f1);
		add(lAvailableShow);	
	
		
		bGalaxy = new Button("Galaxy Cinema");
		bGalaxy.setBounds(300,535,200,50);
		bGalaxy.setFont(f3);
		add(bGalaxy);		
		
		bInox = new Button("R World INOX");
		bInox.setBounds(20,535,200,50);
		bInox.setFont(f3);
		add(bInox);
		

		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}

}