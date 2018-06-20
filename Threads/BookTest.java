//EXPT 13 (03)

import java.lang.*;
import java.io.*;


class Book
{
	String bookName;
	int bookId;
	int count;

	void getData(String bookName , int bookId , int count)
	{
		this.bookName = bookName;
		this.bookId = bookId;
		this.count = count;	
	}
	synchronized void issueBook()
	{
		if(count!=0)
			count--;	
		else
			System.out.println("Copies not available !!!");

	}
	void putData()
	{
		System.out.println("Numberof copies letf are : " + count);
	}

}

class BookSync extends Thread
{
	Book b;
	BookSync(Book b1)
	{
		b = b1;
	}
	public void run()
	{
		b.issueBook();
		b.putData();	
	}
}

class BookTest
{
	public static void main(String args[] ) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name;
		int id;
		int cnt;
		
		
		System.out.println("Enter the book name : ");
		
		name = br.readLine();	

		System.out.println("Enter the book id : ");	

		id = Integer.parseInt(br.readLine());

		System.out.println("Enter the book count : ");	

		cnt = Integer.parseInt(br.readLine());
	
		Book book = new Book();
		
		book.getData(name , id , cnt);
		char ch='Y';
		
			
		System.out.println("Do you want to continue...? (Y/N)");
		ch = br.readLine().charAt(0);
		while(Character.toUpperCase(ch)== 'Y' && book.count != 0 )
		{
			
			BookSync bk=new BookSync(book);
			bk.start();
			if (book.count == 0)
			{
				break;
			}
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
			}
			System.out.println("Do you want to continue...? (Y/N)");
			ch = br.readLine().charAt(0);
		}
	}	
}
/*


C:\TYIF21\Threads>javac BookTest.java

C:\TYIF21\Threads>java BookTest

Enter the book name :
Jpr
Enter the book id :
1123
Enter the book count :
3
Do you want to continue...? (Y/N)
y
Numberof copies letf are : 2
Do you want to continue...? (Y/N)
y
Numberof copies letf are : 1
Do you want to continue...? (Y/N)
y
Numberof copies letf are : 0
Do you want to continue...? (Y/N)
n

*/