import java.awt.*;
import java.applet.*;

public class TriangleUsingDrawLine extends Applet
{
	public void paint(Graphics g)
	{
		g.setFont(new Font("Times New Roman" , Font.BOLD+Font.ITALIC , 25));
		g.drawString("TRIANGLE USING DRAWLINE " , 25 , 25 );
		g.setColor(Color.black);

		g.drawLine(120,70,40,210);
		g.drawLine(40,210,200,210);
		g.drawLine(120,70,200,210);
	}
}

/* <applet code = TriangleUsingDrawLine height = 1000 width = 1000>
</applet> */


