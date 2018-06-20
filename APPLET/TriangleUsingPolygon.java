import java.awt.*;
import java.applet.*;

public class TriangleUsingPolygon extends Applet
{
	public void paint(Graphics g)
	{
		g.setFont(new Font("Times New Roman" , Font.BOLD+Font.ITALIC , 25));
		g.drawString("TRIANGLE USING PLOYGON " , 25 , 25 );
		g.setColor(Color.black);

		int xPoints[] = {120 , 40 , 200 , 120};
		int yPoints[] = {70 , 210 , 210 , 70};
		int n = xPoints.length;

		g.fillPolygon(xPoints, yPoints, n);
	}
}

/* <applet code = TriangleUsingPolygon height = 1000 width = 1000>
</applet> */