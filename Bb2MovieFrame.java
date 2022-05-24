//package MovieTicket;

import java.net.URL;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class Bb2MovieFrame extends Frame
{
	JLabel lPic,lName,lGenre,lLenght,lType,lLanguage,lAbout,lDiscribtion,lDiscribtion1,lDiscribtion2,lDiscribtion3,lAvailableShow;
	Button bCosmo,bInox,bGalaxy,bRajshree;
	
	MyActionListener al = new MyActionListener(this);
	
	Bb2MovieFrame()
	{
		super("Bhool Bhulaiyaa 2");
		this.setBounds(0, 0, 1200, 800);
		setLayout(null);
		
		Font f1 = new Font("Arial",Font.BOLD,35);
		Font f2 = new Font("SANS_SERIF",Font.PLAIN,32);
		Font f3 = new Font("Arial",Font.PLAIN,20);
		
	
		ImageIcon bb2 = new ImageIcon("bb2.jpg");
		lPic = new JLabel(bb2);
		lPic.setBounds(20,30,bb2.getIconWidth(),bb2.getIconHeight());
		lPic.setVisible(true);
		add(lPic);

		lName = new JLabel("Bhool Bhulaiyaa 2");
		lName.setBounds(300,30,300,50);
		lName.setFont(f2);
		add(lName);
		
		lGenre = new JLabel("Comedy, Horror");
		lGenre.setBounds(300,90,300,50);
		lGenre.setFont(f2);
		add(lGenre);		
		
		lType = new JLabel("2D");
		lType.setBounds(300,150,300,50);
		lType.setFont(f2);
		add(lType);
		
		lLenght = new JLabel("2h 23m");
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
		
		lDiscribtion = new JLabel("Set within the sprawling halls of a haveli, Bhool");
		lDiscribtion.setBounds(600,80,500,40);
		lDiscribtion.setFont(f3);
		add(lDiscribtion);
		
		lDiscribtion1 = new JLabel("Bhulaiyaa 2 is a horror movie that is a sequel to the");
		lDiscribtion1.setBounds(600,130,500,40);
		lDiscribtion1.setFont(f3);
		add(lDiscribtion1);
		
		lDiscribtion2 = new JLabel("2007 movie of the same name.");
		lDiscribtion2.setBounds(600,180,500,40);
		lDiscribtion2.setFont(f3);
		add(lDiscribtion2);		
		
		lAvailableShow = new JLabel("Available in Following Cinemas:");
		lAvailableShow.setBounds(20,450,700,40);
		lAvailableShow.setFont(f1);
		add(lAvailableShow);	
		
		bCosmo = new Button("Cosmoplex");
		bCosmo.setBounds(20,535,200,50);
		bCosmo.setFont(f3);
		add(bCosmo);		
		
		bGalaxy = new Button("Galaxy Cinema");
		bGalaxy.setBounds(300,535,200,50);
		bGalaxy.setFont(f3);
		add(bGalaxy);		
		
		bInox = new Button("R World INOX");
		bInox.setBounds(580,535,200,50);
		bInox.setFont(f3);
		add(bInox);
		
		bRajshree = new Button("Rajshree");
		bRajshree.setBounds(860,535,200,50);
		bRajshree.setFont(f3);
		add(bRajshree);		
		

		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}

}