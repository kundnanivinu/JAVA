//EXPT 12 (01)


import java.lang.*;
import java.io.*;

class AuthenticationFailureException extends Exception
{
	AuthenticationFailureException(String msg)
	{
		super(msg);
	}
}

class ExceptionAuthenticationFailureTest
{
	public static void main(String a[])
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String passWord ;

		try
		{
			System.out.println("ENTER THE PASSWORD : ");
			passWord = br.readLine();
			if(passWord != "ITCOLLEGE")
			{
				throw new AuthenticationFailureException("WRONG PASSWORD !!!");
			}
			else
			{
				System.out.println("RIGHT PASSWORD");	
				System.out.println("\n\nWELCOME TO IT COLLEGE LAB");	
			}
		}
		catch(AuthenticationFailureException e)
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


C:\TYIF21>javac ExceptionAuthenticationFailureTest.java

C:\TYIF21>java ExceptionAuthenticationFailureTest
ENTER THE PASSWORD :
password
AuthenticationFailureException: WRONG PASSWORD !!!

*/