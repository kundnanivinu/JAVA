import java.lang.*;

class SyncObj
{
	void disp(String mesg)
	{
		System.out.println("Hello " + mesg);
		try
		{
			Thread.sleep(500);
		}
		catch(InterruptedException e)
		{
		}
	}
}

class SyncTest implements Runnable
{
	String z =" " ;
	Thread t;
	SyncObj s;

	SyncTest(SyncObj a , String b)
	{
		s = a;
		z = b;
		t = new Thread(this);
		t.start();
	}
	public void run()
	{
		synchronized(s)
		{
			s.disp(z);
		}		

	}
}

class SyncDemo
{
	public static void main(String args[])
	{
		SyncObj s = new SyncObj();
		SyncTest s1 = new SyncTest(s , "Sneha");
		SyncTest s2 = new SyncTest(s , "Sujata");
	}
}

/*

C:\TYIF21\Threads>javac SyncDemo.java

C:\TYIF21\Threads>java SyncDemo
Hello Sneha
Hello Sujata
*/