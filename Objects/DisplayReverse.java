// EXPT 02 (3)


class Number
{
	int num , revNum;
	Number(int number)
	{
		num=number;
	}
	
	void reverse()
	{
		do
		{
			revNum = num%10;
			System.out.print(revNum);
			num = num/10;
		}while(num!=0);
	}
}

class DisplayReverse
{
	public static void main(String args[])
	{
		Number n = new Number(789);
		n.reverse();
	}
}

/*

	OUTPUT

C:\TYIF21>javac DisplayReverse.java

C:\TYIF21>java DisplayReverse
987

*/
