class TClass implements Runnable
{
	Thread t;

	TClass()
	{
		t= new Thread();
		t.start();
	}

	public void run()
	{
		try
		{
			System.out.println("From Thread a");
			Thread.sleep(100);
		}
		catch(Exception e)
		{
		}
	}
}

class Output
{
	public static void main(String args[])
	{
		TClass t1  = new TClass();
	}	
}