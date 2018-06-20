import java.awt.*;
import java.applet.*;

public class LoopingApplet extends Applet
{
	String msg;
	public void init()
	{
		msg = "Looping In Applet!!!";
	}

	public void paint(Graphics g)
	{
		g.setFont(new Font("Jokerman" , Font.BOLD+Font.ITALIC , 15));
		g.drawString(msg , 10 , 10);
		int xPos = 50 ;
		int yPos = 50;
		for(int i = 1 ; i  <= 10 ; i++)
		{
			String printData = Integer.toString(i);
			g.drawString(printData , xPos , yPos+i*20);
			try
			{
				Thread.sleep(100);
			}
			catch(Exception e)
			{
			}	
		}
		
	}
}

/* <applet code = LoopingApplet.class height = 1000 width = 1000>
</applet> */