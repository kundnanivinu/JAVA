import java.lang.*;

class Square
{
	int length;
	Square(int x)
	{
		length = x;
	}

	void area()
	{
		int area = length * length;
		System.out.println("AREA OF SQUARE = " + area);
	}
}

class Rectangle extends Square
{
	int breadth;
	Rectangle(int x , int y)
	{
		super(x);
		breadth = y;
	}

	void rectArea()
	{
		int area1 = length * breadth;
		System.out.println("AREA OF RECTANGLE = " + area1);
	}
}

class Box extends Rectangle
{
	int height;
	Box(int x , int y , int z)
	{
		super(x,y);
		height = z;
	}

	void volume()
	{
		int volume = length * breadth * height ;
		System.out.println("VOLUME OF BOX = " + volume);
	}
}

class Shape
{
	public static void main(String a[])
	{
		Box b = new Box(10 , 20 , 30);
		b.volume();
		b.rectArea();
		b.area();
	}
}



/* 
	
OUTPUT

C:\TYIF21>java Shape
VOLUME OF BOX = 6000
AREA OF RECTANGLE = 200
AREA OF SQUARE = 100

*/