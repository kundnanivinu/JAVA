//EXPT 07 (3)


import java.lang.*;
import java.io.*;

class ArraySorting
{
	public static void main(String a[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int array [] = new int[10];
		
		System.out.println("ENTER DATA ONE BY ONE..");
		for(int k= 0 ;  k < array.length ; k++)
		{
			System.out.print("ENTER THE NUMBER " + (k+1) + " : ");
			array[k] = Integer.parseInt(br.readLine());
		}

		for(int k= 0 ;  k < array.length ; k++)
		{
			System.out.println("NUMBER AT " + (k+1) + " IS : " + array[k]);
		}

		for(int i = 0 ; i < array.length ;  i++)
		{
			for(int j = 0 ; j < array.length - i  -1 ; j++)
			{
				if(array[j] > array[j+1])
				{
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}

		System.out.println("NEW ARRAY IS ..");

		for(int k= 0 ;  k < array.length ; k++)
		{
			System.out.println("NUMBER AT " + (k+1) + " IS : " + array[k]);
		}
	}
}

/*

C:\TYIF21>javac ArraySorting.java

C:\TYIF21>java ArraySorting

ENTER DATA ONE BY ONE..
ENTER THE NUMBER 1 : 3
ENTER THE NUMBER 2 : 4
ENTER THE NUMBER 3 : 56
ENTER THE NUMBER 4 : 7
ENTER THE NUMBER 5 : 809
ENTER THE NUMBER 6 : 4
ENTER THE NUMBER 7 : 24
ENTER THE NUMBER 8 : 7
ENTER THE NUMBER 9 : 8
ENTER THE NUMBER 10 : 53

NUMBER AT 1 IS : 3
NUMBER AT 2 IS : 4
NUMBER AT 3 IS : 56
NUMBER AT 4 IS : 7
NUMBER AT 5 IS : 809
NUMBER AT 6 IS : 4
NUMBER AT 7 IS : 24
NUMBER AT 8 IS : 7
NUMBER AT 9 IS : 8
NUMBER AT 10 IS : 53

NEW ARRAY IS ..

NUMBER AT 1 IS : 3
NUMBER AT 2 IS : 4
NUMBER AT 3 IS : 4
NUMBER AT 4 IS : 7
NUMBER AT 5 IS : 7
NUMBER AT 6 IS : 8
NUMBER AT 7 IS : 24
NUMBER AT 8 IS : 53
NUMBER AT 9 IS : 56
NUMBER AT 10 IS : 809

*/