// EXPT 02 (2)



class CheckPrimeLogic
{
	int n;


	CheckPrimeLogic(int n)
	{
		this.n = n;
	}
	void primeNumber()
	{ 
		for(int i=2;i<=n;i++)
		{
			int flag=1;

			for(int j=2;j<i;j++)
			{ 
				if(i%j==0)
				{
					flag=0;
					break;
				}
			}

			if(flag==1)
			{
				System.out.println(i);
			}
		}
	}
}

class DisplayPrimeNumbers
{
	public static void main(String a[])
	{
		CheckPrimeLogic cpl = new CheckPrimeLogic(10);
		System.out.println("PRIME NUMBERS ARE... ");
		cpl.primeNumber();
	}
}

/*

OUTPUT


C:\TYIF21>javac DisplayPrimeNumbers.java

C:\TYIF21>java DisplayPrimeNumbers
PRIME NUMBERS ARE...
2
3
5
7

*/

