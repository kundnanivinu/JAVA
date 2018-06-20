//EXPT 11 (02)


class Server
{
	String serverName ;
	int serverPort;

	Server(String serverName , int serverPort)
	{
		this.serverName = serverName;
		this.serverPort = serverPort;
	}
	void show()
	{
		System.out.println("SERVER NAME IS : " + serverName);
		System.out.println("SERVER PORT IS : " + serverPort);
	}
}

class Client extends Server
{
	String clientName ;
	int clientPort;

	Client(String serverName , int serverPort , String clientName , int clientPort)
	{
		super(serverName , serverPort);
		this.clientName = clientName;
		this.clientPort = clientPort;
	}
	void show()
	{
		super.show();
		System.out.println("CLIENT NAME IS : " + clientName);
		System.out.println("CLIENT PORT IS : " + clientPort);
	}	
}

class FuncOverLoadDemo
{
	public static void main(String a[])
	{
		Client cc = new Client("itUnr.local" , 123 , "itCl2" , 456);
		cc.show();
	}
}

/*

OUTPUT

C:\TYIF21>javac FuncOverLoadDemo.java

C:\TYIF21>java FuncOverLoadDemo
SERVER NAME IS : itUnr.local
SERVER PORT IS : 123
CLIENT NAME IS : itCl2
CLIENT PORT IS : 456

*/

