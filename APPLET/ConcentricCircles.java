import java.awt.*;
import java.applet.*;

public class ConcentricCircles extends Applet
{
	public void paint(Graphics g)
	{
		g.setFont(new Font("Times New Roman" , Font.BOLD+Font.ITALIC , 14));
		g.drawString("CONCENTRIC CIRCLES" , 10 , 10 );
		g.setColor(Color.red);
		g.fillOval(30,30,500,500);
		
		g.setColor(Color.yellow);
		g.fillOval(80,80,400,400);

		g.setColor(Color.orange);
		g.fillOval(130,130,300,300);

		g.setColor(Color.blue);
		g.fillOval(180,180,200,200);
		
	}
}

/* <applet code = ConcentricCircles height = 1000 width = 1000>
</applet> */