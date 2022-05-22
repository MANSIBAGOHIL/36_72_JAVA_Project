//package MovieTicket;

import java.awt.*;
import java.awt.event.*;

public class MyFrame1 extends Frame
{
	Button bTheatre1,bTheatre2,bTheatre3,bTheatre4;
    MyActionListener ml = new MyActionListener(this);
	
	MyFrame1()
	{
        super("Theatre");
		setLayout(null);
		//setBackground(Color.PINK);
		setBounds(0,0,1200,800);
		
		bTheatre1 = new Button("R World INOX");
		bTheatre2 = new Button("Cosmoplex");
		bTheatre3 = new Button("INOX");
		bTheatre4 = new Button("Galaxy Cinema");
		
		bTheatre1.setBounds(150,250,300,80);
		bTheatre2.setBounds(650,250,300,80);
		bTheatre3.setBounds(150,600,300,80);
		bTheatre4.setBounds(650,600,300,80);
		
		Color customColor = new Color(36,118,135);
		Color customColor1 = new Color(220,118,135);
		setBackground(customColor);
		setForeground(Color.white);
		bTheatre1.setBackground(customColor1);
		bTheatre2.setBackground(customColor1);
		bTheatre3.setBackground(customColor1);
		bTheatre4.setBackground(customColor1);
		
		Font f1 = new Font("Arial",Font.BOLD,40);
		bTheatre1.setFont(f1);
		bTheatre2.setFont(f1);
		bTheatre3.setFont(f1);
		bTheatre4.setFont(f1);
		
		bTheatre1.addActionListener(ml);
		bTheatre2.addActionListener(ml);
		bTheatre3.addActionListener(ml);
		bTheatre4.addActionListener(ml);
		
		add(bTheatre1);
		add(bTheatre2);
		add(bTheatre3);
		add(bTheatre4);
		
        addWindowListener(new WindowAdapter()
			{
				//use closing method Not Closed
				public void windowClosing(WindowEvent e)
				{
					System.exit(0);
				}
			});
    }   
}
