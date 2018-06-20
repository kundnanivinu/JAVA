import java.lang.*;

interface Gross
{
	double ta = 800.0;
	double da = 1500.0;

	void gross_sal();
}

class Employee
{
	String name;
	float basicSal;

	Employee(String n , float b)
	{
		name = n ;
		basicSal = b;
	}
	
	void display()
	{
		System.out.println("NAME OF EMPLOYEE : " + name);
		System.out.println("BASIC SALARY OF EMPLOYEE : " + basicSal);
	}
}


class Salary extends Employee implements Gross
{
	float hra;
	Salary(String n , float b , float h)
	{
		super(n , b);
		hra = h;
	}

	void disp()
	{
		display();
		System.out.println("HRA OF EMPLOYEE : " + hra);
	}

	public void gross_sal()
	{
		double grossSal = basicSal + ta +da + hra;
		System.out.println("TA OF EMPLOYEE : " + ta);
		System.out.println("DA OF EMPLOYEE : " + da);
		System.out.println("GROSS SALARY OF EMPLOYEE : " + grossSal);
	}
}

class EmpDetails
{
	public static void main(String a[])
	{
		Salary s = new Salary("Sachin" , 8000 , 3000);
		s.disp();
		s.gross_sal();
	}
}

/*

OUTPUT

C:\TYIF21>java EmpDetails
NAME OF EMPLOYEE : Sachin
BASIC SALARY OF EMPLOYEE : 8000.0
HRA OF EMPLOYEE : 3000.0
TA OF EMPLOYEE : 800.0
DA OF EMPLOYEE : 1500.0
GROSS SALARY OF EMPLOYEE : 13300.0

*/