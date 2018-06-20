import java.awt.*;
import java.applet.*;

public class Cone extends Applet
{
	public void paint(Graphics g)
	{
		g.setFont(new Font("Times New Roman" , Font.BOLD+Font.ITALIC , 25));
		g.drawString("CONE " , 25 , 25);
		g.setColor(Color.black);
		g.fillOval(80,80,200,40);
		
		g.drawLine(80,100,175,30);
		g.drawLine(280,100,175,30);	
		
	}
}

/* <applet code =Cone height = 1000 width = 1000>
</applet> */