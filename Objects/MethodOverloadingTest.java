//EXPT 11 (01)


abstract class Shape
{
	float dim1 , dim2 ;
	public void display()
	{
		System.out.println("DIMENSION1 : " + dim1);
		System.out.println("DIMENSION2 : " + dim2);
	}
	abstract public void area();
}

class Rectangle extends Shape
{
	void getD(float dim1 , float dim2)
	{
		this.dim1 = dim1;
		this.dim2 = dim2;	
	}

	public void area()
	{
		System.out.println("AREA IS :" + dim1*dim2);
	}	
}

class Triangle extends Shape
{
	void getD(float dim1 , float dim2)
	{
		this.dim1 = dim1;
		this.dim2 = dim2;	
	}

	public void area()
	{
		System.out.println("AREA IS :" + ((dim1*dim2)/2));
	}	
}
class MethodOverloadingTest
{
	public static void main(String args[])
	{
		System.out.println("FOR RECTANGLE....");
		Rectangle rect = new Rectangle();
		rect.getD(12f , 13.9f);
		rect.display();
		rect.area();

		System.out.println("FOR TRIANGLE....");
		Triangle tri = new Triangle();
		tri.getD(12f , 13.8f);
		tri.display();
		tri.area();	
	}	
}


/*

OUTPUT


C:\TYIF21>java MethodOverloadingTest
FOR RECTANGLE....
DIMENSION1 : 12.0
DIMENSION2 : 13.9
AREA IS :166.79999
FOR TRIANGLE....
DIMENSION1 : 12.0
DIMENSION2 : 13.8
AREA IS :82.8

*/