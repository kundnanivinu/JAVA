//EXPT 13

//OUTPUT


class Test extends Thread
{
	public void run()
	{
		System.out.println("Begin");
		suspend();
		resume();
		System.out.println("End!");
	}
}

class TestThreadTest
{
	public static void main(String args[])
	{
		Test t = new Test();
		t.start();
	}
}


/*

*/