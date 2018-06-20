import java.awt.*;
import java.applet.*;

public class CircleInsideSquare extends Applet
{
	public void paint(Graphics g)
	{
		g.setFont(new Font("Times New Roman" , Font.BOLD+Font.ITALIC , 25));
		g.drawString("CIRCLE INSIDE A SQUARE" , 25 , 25 );

		g.setColor(Color.black);		
		g.fillRect(60,60,100,100);

		g.setColor(Color.red);		
		g.fillOval(60,60,100,100);
		
	}
}

/* <applet code =CircleInsideSquare height = 1000 width = 1000>
</applet> */