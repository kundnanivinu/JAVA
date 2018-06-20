//EXPT 03 (2)



class Circle
{
	float pi;
	float radius;
	float area;

	Circle()
	{
		pi = 3.14f;
	}
	
	void setData(float radius)
	{
		this.radius = radius;
	}
	
	void area()
	{
		area = pi*radius*radius;
		System.out.println("AREA OF CIRCLE WITH RADIUS " + radius + " IS : " + area);
	}
}

class CircleDemo
{
	public static void main(String a[])
	{
		Circle c = new Circle();
		c.setData(2.4f);
		c.area();
	}
}

OUTPUT


C:\TYIF21>javac CircleDemo.java

C:\TYIF21>java CircleDemo
AREA OF CIRCLE WITH RADIUS 2.4 IS : 18.086403
