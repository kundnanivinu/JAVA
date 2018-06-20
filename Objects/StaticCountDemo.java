////EXPT 06 (1)



import java.io.*;
class StaticCountUsers
{	
	static int count = 0;
	String string;
	String subString;
	
	StaticCountUsers(String string, String subString)
	{
		this.string = string;
		this.subString = subString;	
		count++;
	}

	void search()
	{
		int numberOfOccurences = 0;
		int i = 0;

		while(i = string.indexOf(subString , i) != -1)
		{
			numberOfOccurences++;
			i++;
		}
		System.out.println(string + "\t" + subSring + "\t" + numberOfOccurences );
	}
}

class StaticCountDemo
{
	public static void main(String a[] ) throws IOException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		System.out.println("For user 1.....");
		System.out.println("Enter the string for : \t");
		String str = br.readLine();
		System.out.println("Enter the string to be searched : \t");
		String strSub = br.readLine();

			System.out.println("ENTER THE WORD : ");
			word = br.readLine();
	 	 	for(int i=0 ; i < a.length ; i++)
	  		{
	    			if(a[i].compareTo(word) == 0)
	   		 	{
	      				wordCount++;
	    			 }
			}
		
	   		System.out.println("THE ENTERED WORD IN STRING IS  : " +wordCount + " TIMES !");
	     		System.out.println("DO YOU WANT TO CONTINUE ? (Y/N) : ");
	     		ch = br.readNextLine();
		 }while(ch.toUpperCase() != 'N');
		StaticCountUsers s = new StaticCountUsers();
	 	s.display();
	}
}
	
	