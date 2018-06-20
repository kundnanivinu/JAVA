//EXPT 10 (2)




interface Cassette
{
	public void acceptTitle();
}

interface CD
{	
	public void accept();
}

class Media implements Cassette , CD
{
	String titleOfCassette , titleOfCD;
	
	public void get(String titleOfCassette , String titleOfCD)
	{
		this.titleOfCassette = titleOfCassette;
		this.titleOfCD = titleOfCD;
	}
	public void acceptTitle()
	{
		System.out.println("TITLE OF CASSETTE : " + titleOfCassette);
	}

	public void accept()
	{
		System.out.println("TITLE OF CD : " + titleOfCD);
	}
}

class DemoInterface
{
	public static void main(String a[])
	{
		Media me = new Media();
		me.get("Venus" , "Sony" );
		me.acceptTitle();
		me.accept();
	}
}

/*

	OUTPUT

C:\TYIF21>javac DemoInterface.java

C:\TYIF21>java DemoInterface
TITLE OF CASSETTE : Venus
TITLE OF CD : Sony

*/
