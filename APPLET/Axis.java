import java.awt.*;
import java.applet.*;

public class Axis extends Applet
{
	public void paint(Graphics g)
	{
		g.setFont(new Font("Arial" , Font.BOLD , 10));
		g.drawString("AXIS" , 150 , 5);
		g.drawLine(10,10,110,10);
		g.drawLine(10,10,10,60);
		g.drawLine(10,60,110,60);
		g.drawLine(110,10,110,60);
	}
}

/* <applet code = Axis height = 300 width = 300>
</applet> */