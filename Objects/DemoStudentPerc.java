//EXPT 03 (1)




class Student 
{
	String name;
	int rollNo;
	int sub1;
	int sub2;
	float perc;

	void setData(String name , int rollNo , int sub1 , int sub2)
	{
		this.name = name;
		this.rollNo = rollNo;
		this.sub1 = sub1;
		this.sub2 = sub2;
	}

	void display()
	{
		System.out.println("NAME : " + name);
		System.out.println("ROLL NUMBER : " + rollNo);
		System.out.println("SUB1 : " + sub1);
		System.out.println("SUB2 : " +sub2);
		System.out.println("TOTAL : " + (sub1+sub2));
		perc = ((((float)sub1+(float)sub2)/200)*100);
		System.out.println("PERCENTAGE : " + perc);
	}
}

class DemoStudentPerc
{
	public static void main(String a[])
	{
		Student s = new Student();
		s.setData("abc" , 21 , 80 , 80);
		s.display();
	}
}

/*
OUTPUT
C:\TYIF21>javac DemoStudentPerc.java
C:\TYIF21>java DemoStudentPerc
NAME : abc
ROLL NUMBER : 21
SUB1 : 80
SUB2 : 80
TOTAL : 160
PERCENTAGE : 80.0
*/
