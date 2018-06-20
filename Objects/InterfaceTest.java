//EXPT 10 (1)

interface Exam
{
	public void percentCal();
}

class Student
{
	String name;
	int rollNo;
	int mark1 , mark2;

	Student(String name , int rollNo , int mark1 , int mark2)
	{
		this.name = name;
		this.rollNo = rollNo;
		this.mark1 = mark1;
		this.mark2 = mark2;
	}
}

class Result extends Student implements Exam
{	
	Result(String name , int rollNo , int mark1 , int mark2)
	{
		super(name , rollNo , mark1 , mark2);
	}
	
	public void display()
	{
		System.out.println("NAME : " + name);
		System.out.println("ROLL NUMBER : " + rollNo);
		System.out.println("MARK1 : " + mark1);
		System.out.println("MARK2 : " +mark2);
		System.out.println("TOTAL : " + (sub1+sub2));	
	}

	public void percentCal()
	{
		float perc = ((((float)sub1+(float)sub2)/200)*100);
		System.out.println("PERCENTAGE : " + perc);	
	}
}

class InterfaceTest
{
	Result r = new Result("abc" , 21 , 80 , 80);
	r.display();
	r.percentCal();	
}


/*

	OUTPUT


*/