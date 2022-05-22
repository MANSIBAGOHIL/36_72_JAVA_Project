//package MovieTicket;

//import java.awt.*;
import java.awt.event.*;
//import java.io.*;
//import javax.swing.*;
//import java.lang.*;

public class MyActionListener implements ActionListener
{
	MyFrame mf;
	MyFrame1 mf1;
	
	MyActionListener(MyFrame m){
		this.mf = m;
	}
	MyActionListener(MyFrame1 m){
		this.mf1 = m;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Theatre name"))
		{
			mf1 = new MyFrame1();
			this.mf1.setVisible(true);
			this.mf.setVisible(false);
		}
	}	
}