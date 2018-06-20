import java.awt.*;
import java.applet.*;

public class Cube extends Applet
{
	public void paint(Graphics g)
	{
		g.setFont(new Font("Times New Roman" , Font.BOLD+Font.ITALIC , 25));
		g.drawString("CUBE" , 25 , 25 );

		g.setColor(Color.black);		
		g.fillRect(100,100,200,200);
		
		g.drawLine(100,100,120,80);
		g.drawLine(120,80,320,80);
		g.drawLine(320,80,300,100);
		g.drawLine(300,300,320,280);
		g.drawLine(320,280,320,80);
		
	}
}

/* <applet code =Cube height = 1000 width = 1000>
</applet> */