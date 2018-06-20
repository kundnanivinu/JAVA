//EXPT 15 (02)


import java.awt.*;
import java.applet.Applet;

/*
<applet code = TemperatureTest.class height = 400 width = 400>
<param name = "celsius" value = "36">
</applet> 
*/

class TemperatureTest extends Applet
{
	double c;
	double f;

	public void init()
	{
		c  = Double.parseDouble(getParameter("celsius"));
	}
	public void paint(Graphics g)
	{
		g.setBackground(red);
		g.drawString("TEMPERATURE IN CELSIUS IS..."  + getParameter("celsius") + " ", 20 , 20);
		float faranhiet = (temperature * 100) / 16;
		g.drawString("TEMPERATURE IS..." , 20 , 20);
		g.drawString(faranheit , 60 , 60);
	}
}