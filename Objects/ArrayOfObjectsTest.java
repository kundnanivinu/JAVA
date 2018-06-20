//EXPT 07 (2)




import java.lang.*;
import java.io.*;

class Item
{
	int code;
	float price;
	
	Item(int code , float price)
	{
		this.code = code;
		this.price = price;	
	}
	public void display()
	{
		System.out.println(code + "\t\t" + price);	
	}
		
}

class ArrayOfObjectsTest
{
	public static void main(String a[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Item iObjs[] = new Item[5];
		int code;
		float price , total = 0;
		
		for(int i =  0 ; i < iObjs.length ; i++)
		{
			System.out.println();
			System.out.print("ENTER THE CODE : ");
			code = Integer.parseInt(br.readLine());

			System.out.println();
			System.out.print("ENTER THE PRICE : ");
			price = Float.parseFloat(br.readLine());

			iObjs[i] = new Item(code , price);

			total += iObjs[i].price;
		}

		System.out.print("CODE\t\tPRICE");
		for(int i =  0 ; i < iObjs.length ; i++)
		{
			System.out.println();
			iObjs[i].display();
		}

		System.out.println("\nTOTAL PRICE : " + total);
	}
}





C:\TYIF21>javac ArrayOfObjectsTest.java

C:\TYIF21>java ArrayOfObjectsTest


/*

OUTPUT

ENTER THE CODE : 1

ENTER THE PRICE : 21

ENTER THE CODE : 2

ENTER THE PRICE : 22

ENTER THE CODE : 3

ENTER THE PRICE : 23

ENTER THE CODE : 4

ENTER THE PRICE : 24

ENTER THE CODE : 5

ENTER THE PRICE : 25

CODE            PRICE
1               21.0

2               22.0

3               23.0

4               24.0

5               25.0

TOTAL PRICE : 115.0

*/