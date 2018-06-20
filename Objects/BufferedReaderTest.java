//EXPT 05 (1)


import java.lang.*;
import java.io.*;

class SimpleInterest
{
	float principal;
	float rateOfInterest;
	float numberOfYears;
	float simpleInterest;
	

	SimpleInterest(float p , float n , float r)
	{
		principal = p;
		numberOfYears = n;
		rateOfInterest = r;
	}
	
	void display()
	{
		System.out.println("PRINCIPAL AMOUNT : " + principal);
		System.out.println("RATE OF INTEREST : " + rateOfInterest);
		System.out.println("NUMBER OF YEARS : " + numberOfYears);

		simpleInterest = (principal*numberOfYears*rateOfInterest) /100;
		
		System.out.println("SIMPLE INTEREST : " + simpleInterest);
	}
}

class BufferedReaderTest
{
	public static void main(String a[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER THE PRINCIPAL AMOUNT : ");
		float p = Float.parseFloat(br.readLine());
		System.out.println("NUMBER OF YEARS : " );
		float n = Float.parseFloat(br.readLine());
		System.out.println("RATE OF INTEREST : " );
		float r = Float.parseFloat(br.readLine());
		
		SimpleInterest si = new SimpleInterest(p,n,r);
		si.display();
	}
}

/*

	OUTPUT

C:\TYIF21>java BufferedReaderTest
ENTER THE PRINCIPAL AMOUNT :
23000
NUMBER OF YEARS :
4
RATE OF INTEREST :
6.5
PRINCIPAL AMOUNT : 23000.0
RATE OF INTEREST : 6.5
NUMBER OF YEARS : 4.0
SIMPLE INTEREST : 5980.0

*/