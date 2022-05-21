//package MovieTicket;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener implements ActionListener
{
	MyFrame mf;
	
	MyActionListener(MyFrame m){
		this.mf = m;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		System.out.println(e.getActionCommand());
	}
}