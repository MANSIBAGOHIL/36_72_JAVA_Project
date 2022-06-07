//package MovieTicket;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CosmoplexFrame extends JFrame
{
	JButton b1;
	MyActionListener ml;
	CosmoplexFrame()
	{
		super("Cosmoplex Theatre");
		setLayout(null);
		setBounds(0,0,1200,900);
		
		ml = new MyActionListener(this);
		b1 = new JButton("welcome to Cosmoplex Theatre");
		
		b1.setBounds(100,100,500,100);
		
		Color customColor = new Color(220,190,145);
		Color customColor1 = new Color(220,118,135);
		getContentPane().setBackground(customColor);
		setForeground(Color.white);
		b1.setBackground(customColor1);
		
		Font f1 = new Font("Arial",Font.BOLD,40);
		b1.setFont(f1);
		
		b1.addActionListener(ml);
		add(b1);
		/*addWindowListener(new WindowAdapter()
			{
				//use closing method Not Closed
				public void windowClosing(WindowEvent e)
				{
					System.exit(0);
				}
			});*/
			this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
	}
}