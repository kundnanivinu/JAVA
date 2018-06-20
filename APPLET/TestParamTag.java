import java.awt.*;
import java.applet.*;


/* <applet code = TestParamTag.class height = 300 width = 300>
<param name = "arr" value = "vinu","aarti","deepak","varsha","raj","vidhi","ankit","neha">
</applet> */


class TestParamTag extends Applet
{
	String arr = new String[7];
	/*public void init()
	{	
		for(int i = 0 ;  i < arrInit.length() ; i++)
		{
			arrInit[i] = getParameter(arr[i]);	
		}
	}*/
	
	public void paint(Graphics g)
	{
		int xPos = 50;
		int yPos = 50;
		g.drawString("ARRAY IS .. " , 10 ,10);
		
		for(int i = 0 ;  i < arrInit.length() ; i++)
		{
			g.drawString(getParameter(arr[i]) , xPos , yPos+i*20);	
		}
	}	
}

