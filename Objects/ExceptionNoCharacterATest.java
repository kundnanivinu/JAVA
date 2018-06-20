//EXPT 12 (03)


import java.lang.*;
import java.io.*;

class NoCharacterAException extends Exception
{
	NoCharacterAException(String msg)
	{
		super(msg);
	}
}

class ExceptionNoCharacterATest
{
	public static void main(String a[])
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String testString ;
		boolean flag = false;

		try
		{
			System.out.println("ENTER THE STRING : ");
			testString = br.readLine();
			char stringTest[] = testString.toCharArray();
			
			for(int i = 0 ; i < testString.length() ; i++)
			{
	
				if(stringTest[i] == 'a')
				{
					flag = true;
					break;
				}
			}
			if(flag == false)
			{
				throw new NoCharacterAException("NO 'A' CHARACTER EXCEPTION !!!");
			}
		}
		catch(NoCharacterAException e)
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

C:\TYIF21>JAVAC ExceptionNoCharacterATest.java

C:\TYIF21>java ExceptionNoCharacterATest
ENTER THE STRING :
vinu
NoCharacterAException: NO 'A' CHARACTER EXCEPTION !!!

*/