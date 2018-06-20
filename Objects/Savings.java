import Acc.Account;
import Trans.Transaction;


public class Savings extends Account implements Transaction
{
	public float amt;
	float temp;	

	public Savings(float bal , int acc_no , float amt)
	{
		super(bal , acc_no);
		this.amt = amt;
	}

	public void Deposit()
	{
		temp = amt + bal;	
	}

	public void display()
	{
		System.out.println("Amount = " + amt);
		System.out.println("Total Amount = " + temp);
	}

	public static void main(String a[])
	{
		Savings s1 = new Savings(100000.0f , 123478 , 56789.90f);

		s1.disp();

		s1.Deposit();

		s1.display();
	}
}



/*

C:\TYIF21>javac Savings.java

C:\TYIF21>java Savings
Account Number = 123478
Balance = 100000.0
Amount = 56789.9
Total Amount = 156789.9

*/