import java.awt.*;
import java.applet.*;

public class BarChart extends Applet
{
	public void paint(Graphics g)
	{
		g.setFont(new Font("Times New Roman" , Font.BOLD+Font.ITALIC ,25));
		g.setColor(Color.red);
		g.drawString("BARCHART....." , 25 , 25 );
		g.drawString("YEARS" , 150 , 380 );
		g.drawString("R" , 7 , 130 );
		g.drawString("E" , 7 , 155 );	
		g.drawString("S" , 7 , 180 );
		g.drawString("U" , 7 , 205 );
		g.drawString("L" , 7 , 230 );
		g.drawString("T" , 7 , 255 );
		g.drawString("2001" , 80 , 350 );
		g.drawString("2002" , 140 , 350 );
		g.drawString("2003" , 200 , 350 );
		g.drawString("2004" , 270 , 350 );
		g.drawString("2005" , 330 , 350 );	
		g.drawString("-" , 57 , 120 );
		g.drawString("-" , 57 , 140 );	
		g.drawString("-" , 57 , 160 );
		g.drawString("-" , 57 , 180 );
		g.drawString("-" , 57 , 200 );
		g.drawString("-" , 57 , 220 );
		g.drawString("-" , 57 , 240 );
		g.drawString("-" , 57 , 260 );
		g.drawString("-" , 57 , 280 );
		g.drawString("-" , 57 , 300 );
	
		g.setFont(new Font("Times New Roman" , Font.BOLD+Font.ITALIC ,15));
		
		g.drawString("100" , 30 , 120 );
		g.drawString("90" , 30 , 140 );	
		g.drawString("80" , 30 , 160 );
		g.drawString("70" , 30 , 180 );
		g.drawString("60" , 30 , 200 );
		g.drawString("50" , 30 , 220 );
		g.drawString("40" , 30 , 240 );
		g.drawString("30" , 30 , 260 );
		g.drawString("20" , 30 , 280 );
		g.drawString("10" , 30 , 300 );

		g.setColor(Color.red);
		g.drawLine(60,60,60,340);
		g.drawLine(40,320,420,320);	
		g.setColor(Color.orange);		//1ST
		g.fillRect(80,150,40,170);
		
		g.setColor(Color.orange);		//2ND
		g.fillRect(145,135,40,185);

		g.setColor(Color.orange);		//3RD
		g.fillRect(210,120,40,200);

		g.setColor(Color.orange);		//4TH
		g.fillRect(275,105,40,215);	

		g.setColor(Color.orange);		//5TH
		g.fillRect(340,112,40,208);

		g.setColor(Color.red);		// TOP ARROW
		g.drawLine(60,60,50,70);
		g.drawLine(60,60,70,70);

		g.setColor(Color.red);		// BOTTOM ARROW
		g.drawLine(60,340,50,330);
		g.drawLine(60,340,70,330);

		g.setColor(Color.red);		//RIGHT ARROW
		g.drawLine(40,320,50,310);
		g.drawLine(40,320,70,330);

		g.setColor(Color.red);		//LEFT ARROW
		g.drawLine(420,320,410,310);		
		g.drawLine(420,320,410,330);	
	}
}

/* <applet code = BarChart height = 2000 width = 2000>
</applet> */