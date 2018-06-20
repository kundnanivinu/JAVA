//EXPT 04 (1)



class Shape
{

	static void area(float dim)
	{
		System.out.println("LENGTH OF SQUARE IS : " + dim);
		System.out.println("AREA OF SQUARE IS : " + dim*dim);	
	}

	static void area(float dim1 , float dim2)
	{
		System.out.println("LENGTH OF RECTANGLE IS : " + dim1);
		System.out.println("BREADTH OF RECTANGLE IS : " + dim2);
		System.out.println("AREA OF RECTANGLE = " + dim1*dim2);	
	}
}

class ShapeFuncOverload
{
	public static void main(String a[])
	{
		Shape s = new Shape();
		
		s.area(23);
		s.area(2 , 3);
	}
}

/*

	OUTPUT

C:\TYIF21>javac ShapeFuncOverload.java

C:\TYIF21>java ShapeFuncOverload
LENGTH OF SQUARE IS : 23.0
AREA OF SQUARE IS : 529.0
LENGTH OF RECTANGLE IS : 2.0
BREADTH OF RECTANGLE IS : 3.0
AREA OF RECTANGLE = 6.0

*/