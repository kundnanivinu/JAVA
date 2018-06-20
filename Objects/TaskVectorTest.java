//EXPT 08 (2)



class TaskVectorTest
{
	public static void main(String a[])
	{
		Vector v = new Vector();
		
		int temp;
		for(int i = 0 ; i <= 4 ; i++)
		{
			temp = i+10;
			v.addElement(new Integer(temp));
		}
	
		v.addElement("VINU");
		v.addElement("AARTI");
		v.addElement("CHITRA");

		v.addElement(new Character('a'));
		v.addElement(new Character('v'));

		v.addElement(new Float (1.2f));
		v.addElement(new Float (2.2f));
	
	  	 BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("ENTER ANY STRING : ");
		String s = br.readLine();
		v.addElement(s);
	 
		v.removeElementAt(2);
	    
		System.out.println("SEARCHING ELEMENT...");
		System.out.println("ENTER THE OBJECT TO BE SEARCHED : ");
		String s1 = b.readLine();
		boolean b1 = v.contains(s1);
		
		if(b1 == true)
			System.out.println("OBJECT IS PRESENT ! ");

		else
			System.out.println("OBJECT IS NOT FOUND ! ");	

		System.out.println("FIRST ELEMENT : "+ (v.firstElement()));
		System.out.println("LAST ELEMENT : "+ (v.lastElement()));

		Enumeration e = v.elements();
		System.out.println("DISPLAYING VECTOR...\n");
		while(e.hasMoreElements());
		{
			System.out.println(e.nextElement());
		}
	
	}	
}