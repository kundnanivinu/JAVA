import box.*;

class TestPackageBox
{
	public static void main(String a[])
	{
		Box b1 = new Box(12.7f , 1.8f , 4.5f);

		b1.disp();

		float volume = b1.length * b1.breadth * b1.height;

		System.out.println("Volume of box = " + volume);
	}
}



/*
C:\TYIF21>javac TestPackageBox.java

C:\TYIF21>java TestPackageBox
Length = 12.7
Breadth = 1.8
Height = 4.5
Volume of box = 102.869995

C:\TYIF21>
*/