import java.awt.*;
import java.applet.*;

public class Rectify2 extends Applet
{
	public void paint(Graphics g)
	{
		g.drawArc(60,125,80,40,180,180);
		g.setFont(new Font("Arial" , Font.BOLD , 10));
		g.drawString("Arc Example",50,50);
		
	}
}

/* <applet code = Rectify2.class height = 100 width = 300>
</applet> */