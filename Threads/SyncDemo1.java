//EXPT 13(02)


class ShareData
{
	int count;
	synchronized void getData(int d)
	{
		count = d;
		System.out.println("Got !");
	}

	synchronized void putData()
	{
		System.out.println("Put : " + count);
	}
}

class TestGet extends Thread
{
	ShareData tg;
	int gCount;
	
	TestGet(ShareData tg1 , int gCount1)
	{
		tg = tg1;
		gCount = gCount1;
	}

	public void run()
	{
		int i = 0 ;
		while(true)
		{
			tg.getData(i++);
			try
			{
				Thread.sleep(gCount);
			}
			catch(InterruptedException e)
			{
			}
		}
	}
}

class TestPut extends Thread
{
	ShareData tp;
	int pCount;
	
	TestPut(ShareData tp1 , int pCount1)
	{
		tp = tp1;
		pCount = pCount1;
	}

	public void run()
	{
		int i = 0 ;
		while(true)
		{
			tp.putData();
			try
			{
				Thread.sleep(pCount);
			}
			catch(InterruptedException e)
			{
			}
		}
	}
}

class SyncDemo1
{
	public static void main(String args[])
	{
		ShareData sd = new ShareData();
		TestGet g = new TestGet(sd , 100);
		TestPut p = new TestPut(sd , 200);
		g.start();
		p.start();
	}
}


/*
		OUTPUT

Put : 46
Got !
Got !
Put : 48
Got !
Got !
Put : 50
Got !
Got !
Put : 52
*/



