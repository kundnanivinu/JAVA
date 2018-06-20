//EXPT 13 (01)


import java.lang.*;

class Prime extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<=10;i++)
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
					System.out.println("PRIME THREAD " + i);
				}
				Thread.sleep(500);
			}
			
		}
		catch(InterruptedException e)
		{
		}
	}
}

class NonPrime extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<=10;i++)
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

				if(flag==0)
				{
					System.out.println("NON PRIME THREAD : " + i);
				}
				Thread.sleep(500);
			}

			
		}
		catch(InterruptedException e)
		{
		}
	}
}

class PrimeNonPrimeNumbers
{
	public static void main(String args[])
	{
		new Prime().start();
		new NonPrime().start();
		System.out.println("Exit from main !!!");
	}
}

/*

C:\TYIF21\Threads>javac PrimeNonPrimeNumbers.java

C:\TYIF21\Threads>java PrimeNonPrimeNumbers
Exit from main !!!
PRIME THREAD 0
PRIME THREAD 1
PRIME THREAD 2
PRIME THREAD 3
NON PRIME THREAD : 4
PRIME THREAD 5
NON PRIME THREAD : 6
PRIME THREAD 7
NON PRIME THREAD : 8
NON PRIME THREAD : 9
NON PRIME THREAD : 10

*/