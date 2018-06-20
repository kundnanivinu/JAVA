EXPT 12 (02)


import java.lang.*;
import java.io.*;

class EvenNumException extends Exception
{
	EvenNumException(String msg)
	{
		super(msg);
	}
}

class ExceptionEvenNumTest
{
	public static void main(String a[])
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;

		try
		{
			System.out.println("ENTER THE NUMBER : ");
			n = Integer.parseInt(br.readLine());
			if(n % 2 != 0)
			{
				throw new EvenNumException("WRONG INPUT i.e. IT IS AN ODD NUMBER !!!");
			}
			else
			{
				System.out.println("EVEN INPUT");	
			}
		}
		catch(EvenNumException e)
		{
			System.out.println(e);	
		}

		catch(IOException e)
		{
			System.out.println(e);	
		}	
	}
}


/*


	OUTPUT

C:\TYIF21>javac ExceptionEvenNumTest.java

C:\TYIF21>java ExceptionEvenNumTest
ENTER THE NUMBER :
3
EvenNumException: WRONG INPUT i.e. IT IS AN ODD NUMBER !!!

*/