import java.lang.*;

class Even extends Thread
{
	public void run()
	{
		try
		{
			for(int i = 2 ; i  <= 10 ; i = i + 2)
			{
				System.out.println("Even Thread : " + i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
		}
	}
}

class Odd extends Thread
{
	public void run()
	{
		try
		{
			for(int i = 1 ; i  < 10 ; i = i + 2)
			{
				System.out.println("Odd Thread : " + i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
		}
	}
}

class EvenOdd
{
	public static void main(String args[])
	{
		new Even().start();
		new Odd().start();
		System.out.println("Exit from main !!!");
	}
}

/*

C:\TYIF21\Threads>javac EvenOdd.java

C:\TYIF21\Threads>java EvenOdd
Even Thread : 2
Odd Thread : 1
Exit from main !!!
Even Thread : 4
Odd Thread : 3
Odd Thread : 5
Even Thread : 6
Odd Thread : 7
Even Thread : 8
Odd Thread : 9
Even Thread : 10

C:\TYIF21\Threads>java EvenOdd
Even Thread : 2
Odd Thread : 1
Exit from main !!!
Odd Thread : 3
Even Thread : 4
Even Thread : 6
Odd Thread : 5
Even Thread : 8
Odd Thread : 7
Odd Thread : 9
Even Thread : 10

C:\TYIF21\Threads>javac EvenOdd.java

C:\TYIF21\Threads>java EvenOdd
Even Thread : 2
Exit from main !!!
Odd Thread : 1
Odd Thread : 3
Even Thread : 4
Odd Thread : 5
Even Thread : 6
Odd Thread : 7
Even Thread : 8
Odd Thread : 9
Even Thread : 10

*/