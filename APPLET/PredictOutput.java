import java.awt.*;
import java.applet.*;

public class PredictOutput extends Applet
{
	public void paint(Graphics g)
	{
		int X[] = {20 , 120 , 220 , 20};
		int Y[] = {20 , 120 , 20 , 20};
		int n = X.length;
		g.drawPolygon(new Polygon(X,Y,n));
		
	}
}

/* <applet code = PredictOutput.class height = 100 width = 300>
</applet> */