//EXPT 05 (2)



import java.lang.*;
import java.io.*;

class CountString
{
	public static void main(String a[]) throws IOException
	{
		int vowelCount = 0 ;
		int digitCount  = 0;
		int blankSpaceCount = 0 ;
		int tabCount  = 0 ;
		int consonantCount = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER THE STRING : ");
		String string1 = br.readLine();

		char stringTest[] = string1.toCharArray();

		for(int i = 0 ; i < string1.length() ; i++)
		{
			if(Character.isLetterOrDigit(stringTest[i]))
			{
				if(Character.isDigit(stringTest[i]))
				{
					digitCount++;
				}
				else
				{
					if(stringTest[i] == 'a' || stringTest[i] == 'e' || stringTest[i] == 'i' || stringTest[i] == 'o' || stringTest[i] == 'u' || stringTest[i] == 'A' || stringTest[i] == 'E' || stringTest[i] == 'I' || stringTest[i] == 'O' || stringTest[i] == 'U' )
					{
						vowelCount++;
					}
					else
					{
						consonantCount++;
					}
				}
			}
			
			else if(Character.isSpaceChar(stringTest[i]))						//else if(stringTest[i] == '\b' || stringTest[i] == ' ')
			{
				blankSpaceCount++;
			}
			else if(Character.isSpace(stringTest[i]))					//else if (stringTest[i] == '\t' || stringTest[i] == '	')
			{
				tabCount++;
			}
		}
		System.out.println("THE VOWEL COUNT IS : " + vowelCount);
		System.out.println("THE DIGIT COUNT IS : " + digitCount);
		System.out.println("THE CONSONANT COUNT IS : " + consonantCount);
		System.out.println("THE BLANK SPACE COUNT IS : " + blankSpaceCount);
		System.out.println("THE TAB COUNT IS : " + tabCount);
	}
}


/*
	OUTPUT

C:\TYIF21>javac CountString.java

C:\TYIF21>java CountString
ENTER THE STRING :
vinu123 gef     89
THE VOWEL COUNT IS : 3
THE DIGIT COUNT IS : 5
THE CONSONANT COUNT IS : 4
THE BLANK SPACE COUNT IS : 1
THE TAB COUNT IS : 1


*/
