import java.lang.*;
import java.io.*;

class MyException extends Exception
{
	MyException(String msg)
	{
		super(msg);
	}
}

class ExceptionTest
{
	public static void main(String a[])
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;

		try
		{
			System.out.println("ENTER THE NUMBER : ");
			n = Integer.parseInt(br.readLine());
			if(n > 0)
			{
				throw new MyException("NUMBER IS POSITIVE");
			}
			else
			{
				throw new MyException("NUMBER IS NEGATIVE");
			}
		}
		catch(MyException e)
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


C:\TYIF21>javac ExceptionTest.java

C:\TYIF21>java ExceptionTest
ENTER THE NUMBER :
-8
MyException: NUMBER IS NEGATIVE

*/