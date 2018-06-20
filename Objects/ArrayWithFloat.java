//EXPT 07 (1)



import java.lang.*;
import java.io.*;

class ArrayWithFloat
{	
	public static void main(String a[]) throws Exception
	{
		float appleArray[] = new float [7];
		float avg , temp , sum = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("ENTER DATA ONE BY ONE..");
		for(int i = 0 ; i < appleArray.length ; i++)
		{
			System.out.println();
			System.out.print("ENTER THE SALE FOR " + (i+1) + " DAY OF WEEK : ");
			temp = Float.parseFloat(br.readLine());
			appleArray[i] = temp;
				
		}
		for(int i = 0 ; i < appleArray.length ; i++)
		{	
			sum += appleArray[i];
		}
		avg = (sum/(float)7);	
		System.out.println("AVERAGE SALE :" +avg);
	}
}

/*
	OUTPUT

C:\TYIF21>javac ArrayWithFloat.java

C:\TYIF21>java ArrayWithFloat
ENTER DATA ONE BY ONE..

ENTER THE SALE FOR 1 DAY OF WEEK : 12

ENTER THE SALE FOR 2 DAY OF WEEK : 13

ENTER THE SALE FOR 3 DAY OF WEEK : 14

ENTER THE SALE FOR 4 DAY OF WEEK : 15

ENTER THE SALE FOR 5 DAY OF WEEK : 16

ENTER THE SALE FOR 6 DAY OF WEEK : 17

ENTER THE SALE FOR 7 DAY OF WEEK : 18
AVERAGE SALE :15.0

*/
