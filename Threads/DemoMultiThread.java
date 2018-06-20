class ThreadClass extends Thread
{
	public void run()
	{	
		try
		{

			System.out.println("This is thread1");
			sleep(100);
		}
		catch(Exception e)
		{
		}
	}
}

class DemoMultiThread
{
	public static void main(String args[])
	{
		ThreadClass t1 = new ThreadClass();
		ThreadClass t2 = new ThreadClass();

		t1.run();
		t2.run();
	}	
}


/*

C:\TYIF21\Threads>javac DemoMultiThread.java

C:\TYIF21\Threads>java DemoMultiThread
This is thread1
This is thread1

*/