import java.util.*;

class CommandLineVectorTest
{
	public static void main(String args[])
	{
		Vector v = new Vector(args.length);
		for(int i = 0 ; i < args.length ; i++)
		{
			v.addElement(args[i]);
		}

		System.out.println("\nDISPLAYING VECTOR...");

		int size  = v.size();
		String listArray[] = new String[size];
		v.copyInto(listArray);

		for(int j = 0 ;  j < listArray.length ; j++)
		{
			System.out.println(listArray[i]);
		}

		/*Enumeration e = v.elements();

		while(e.hasMoreElements())
		{
