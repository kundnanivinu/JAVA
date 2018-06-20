import java.lang.*
import java.io.*

class MyException Extends Exception
{
	my Exception(String msg)
	{
		Super(msg)
	}
}
class ExceptionProg
	{
		public static void main(String a[])
		{
			BufferedReader br=new BufferedReader(new InputStreamReadere(System.in));
			int n;
			try
			{
				System.out.println("enter the number");
				n=Integer.parseInt(br.readLine());
				if(n%2==0)
				{
					throw new myException("number is even");
				}
				else
				{
					throw new myException("number is odd");
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
