// EXPT 02 (1)


class Data
{
	int num1;
	int num2;
	int num3;

	Data(int num1 , int num2 , int num3)
	{
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}

	public void display()
	{
		System.out.println("FIRST NUMBER = " + num1);
		System.out.println("SECOND NUMBER = " + num2);
		System.out.println("THIRD NUMBER = " + num3);
	}

	public void greater()
	{
		if(num1 > num2 && num1 > num3)
		{
			System.out.println("FIRST NUMBER IS GREATER !");
		}

		else 
			if(num2 > num1  && num2 > num3)
			{
				System.out.println("SECOND NUMBER IS GREATER !");
			}
			else
				if(num3 > num1  && num3 > num2)
				{
					System.out.println("THIRD NUMBER IS GREATER !");
				}
				else
				{
					System.out.println("ALL THREE ARE EQUAL !");	
				}
	}
}

class TestGreaterNumbers
{
	public static void main(String a[])
	{
		Data d = new Data(12 , 4, 30);
		d.display();
		d.greater();
	}
}


/*
OUTPUT

C:\TYIF21>javac TestGreaterNumbers.java

C:\TYIF21>java TestGreaterNumbers
FIRST NUMBER = 12
SECOND NUMBER = 4
THIRD NUMBER = 30
THIRD NUMBER IS GREATER !

*/
