import java.awt.*;
import java.applet.*;

/* <applet code = Question.class height = 100 width = 100>
<param name = "Q" value = "Is Applet Simple?">
<param name = "A" value = " ">
</applet> */

public class Question extends Applet
{
	String Qu , An;
	
	public void init()
	{
		Qu = getParameter("Q");
		An = getParameter("A");
	}
	public void paint(Graphics g)
	{
		g.drawString(Qu , 10 , 50);
		g.drawString(An , 10 , 100);
		
	}
}

