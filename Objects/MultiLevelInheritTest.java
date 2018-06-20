//EXPT 09 (2)



class Account 
{
	String custName;
	int accNo;

	Account(String custName , int accNo)
	{
		this.custName = custName;
		this.accNo = accNo;
	}

	void display()
	{
		System.out.println("CUSTOMER NAME : " + custName);
		System.out.println("ACCOUNT NUMBER : " + accNo);
	}
}

class SavingAccount extends Account
{
	float minBal;
	float savingBal;

	SavingAccount(String name , int accNo , float minBal , float savingBal)
	{
		super(name , accNo);
		this.minBal = minBal;
		this.savingBal= savingBal;
	}

	void displayData()
	{
		System.out.println("MINIMUM BALANCE : " + minBal);
		System.out.println("SAVING BALANCE : " + savingBal);
	}
}

class AccountDetails extends SavingAccount
{
	float deposits;
	float withdrawl;

	AccountDetails(String name , int accNo , float minBal , float savingBal , float deposits , float withdrawl)
	{
		super(name , accNo, minBal , savingBal);
		this.minBal = minBal;
		this.savingBal= savingBal;
		this.deposits = deposits;
		this.withdrawl = withdrawl;
	}

	void displayDetails()
	{
		System.out.println("DEPOSITS : " + deposits);
		System.out.println("WITHDRAWL : " + withdrawl);
	}
}

class MultiLevelInheritTest
{
	public static void main(String a[])
	{
		AccountDetails ad = new AccountDetails("xyz" , 32 , 500f , 23000f , 3543f , 4567f);
		ad.display();
		ad.displayData();
		ad.displayDetails();
	}
}

/*

OUTPUT


C:\TYIF21>java MultiLevelInheritTest
CUSTOMER NAME : xyz
ACCOUNT NUMBER : 32
MINIMUM BALANCE : 500.0
SAVING BALANCE : 23000.0
DEPOSITS : 3543.0
WITHDRAWL : 4567.0

*/