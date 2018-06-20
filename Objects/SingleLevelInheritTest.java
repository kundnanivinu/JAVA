//EXPT 09 (1)

class Person
{
	String name;
	int age;

	Person(String name , int age)
	{
		this.name = name;
		this.age = age;	
	}

	void display()
	{
		System.out.println("NAME : " + name);
		System.out.println("AGE : " + age);
	}
}

class Employee extends Person
{
	String employeeDesignation;
	float empSalary;

	Employee(String name , int age , String employeeDesignation , float empSalary)
	{
		super(name , age);
		this.employeeDesignation = employeeDesignation;
		this.empSalary= empSalary;
	}

	void displayData()
	{
		System.out.println("EMPLOYEE DESIGNATION : " + employeeDesignation);
		System.out.println("EMPLOYEE SALARY : " + empSalary);
	}
}

class SingleLevelInheritTest
{
	public static void main(String a[])
	{
		Employee e = new Employee("abc" , 21 , "manager" , 23000f);
		e.display();
		e.displayData();
	}
}



/*

OUTPUT


C:\TYIF21>javac SingleLevelInheritTest.java

C:\TYIF21>java SingleLevelInheritTest
NAME : abc
AGE : 21
EMPLOYEE DESIGNATION : manager
EMPLOYEE SALARY : 23000.0


*/