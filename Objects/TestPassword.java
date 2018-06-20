//EXPT 06 (2)


import java.lang.*;
import java.io.*;

class TestPassword
{
	public static void main(String a[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String password = "Vinu";
		String inputPassword;

		System.out.println("ENTER THE PASSWORD : ");
		inputPassword = br.readLine();

		if(password.equals(inputPassword))
		{

			System.out.println("Good..!!");	
				
		}
		else
		{
			System.out.println("Incorrect Password..!!");	
				
		}

		password = password + " , Welcome To Java..!!";
		System.out.println(password);	

		StringBuffer reversePassword = new StringBuffer(password);
		reversePassword.reverse();

		System.out.println("Reverse Password : " + reversePassword);

		password.replace('!' , '*');
		
		System.out.println("Changed Password : " + password);
		
	}
}

/*

	OUTPUT



C:\TYIF21>javac TestPassword.java

C:\TYIF21>java TestPassword
ENTER THE PASSWORD :
Vinu
Good..!!
Vinu , Welcome To Java..!!
Reverse Password : !!..avaJ oT emocleW , uniV
Changed Password : Vinu , Welcome To Java..!!

C:\TYIF21>

*/