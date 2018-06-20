//EXPT 05(1)

import java.io.*;

class SimpleInterest
{
	double principal;
	int years;
	float rateOfInterest;

	SimpleInterest(double principal , int years , float rateOfInterest)
	{
		this.principal = principal;
		this.years = years;
		this.rateOfInterest = rateOfInterest;
	}

	void compute()
	{
		System.out.println("SIMPLE INTEREST = " + (principal * years * rateOfInterest) / 100.0);
	}
}

class SimpleInterestTest
{	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER THE PRINCIPAL : ");
		double pr = Double.parseDouble(br.readLine());
		System.out.println("ENTER THE YEARS : ");
		int pe = Integer.parseInt(br.readLine());
		System.out.println("ENTER THE RATE OF INTEREST : ");	
		float r = Float.parseFloat(br.readLine());	

		SimpleInterest si = new SimpleInterest(pr , pe , r);
		si.compute();
	}
}

/*
	OUTPUT


C:\TYIF21>javac SimpleInterestTest.java

C:\TYIF21>java SimpleInterestTest
ENTER THE PRINCIPAL :
10000
ENTER THE YEARS :
2
ENTER THE RATE OF INTEREST :
10
SIMPLE INTEREST = 2000.0

*/