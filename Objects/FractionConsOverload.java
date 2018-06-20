//EXPT 04(2)



class Fraction
{
	float numerator;
	float denominator;
	float fractionVal;

	Fraction()
	{
		numerator = 45f;
		denominator = 23.5f;
	}

	Fraction(float numerator , float denominator)
	{
		this.numerator = numerator;
		this.denominator = denominator;
	}

	Fraction(Fraction f)
	{
		this.denominator = f.denominator;
		this.numerator = f.numerator;
	}


	void calFractionalValue()
	{
		fractionVal = numerator/denominator;
		System.out.println("NUMERATOR = " + numerator);
		System.out.println("DENOMINATOR = " + denominator);
		System.out.println("FractionalValue = " + fractionVal);	
	}
}

class FractionConsOverload
{
	public static void main(String a[])
	{
		Fraction f1 = new Fraction();
		Fraction f2 = new Fraction(12f , 78f);
		Fraction f3 = new Fraction(f2);


		System.out.println("FOR OBJECT 1...");
		f1.calFractionalValue();
		System.out.println("FOR OBJECT 1...");
		f2.calFractionalValue();
		System.out.println("FOR OBJECT 2...");
		f3.calFractionalValue();
	}
}


OUTPUT


C:\TYIF21>javac FractionConsOverload.java

C:\TYIF21>java FractionConsOverload
FOR OBJECT 1...
NUMERATOR = 45.0
DENOMINATOR = 23.5
FractionalValue = 1.9148936
FOR OBJECT 1...
NUMERATOR = 12.0
DENOMINATOR = 78.0
FractionalValue = 0.15384616
FOR OBJECT 2...
NUMERATOR = 12.0
DENOMINATOR = 78.0
FractionalValue = 0.15384616
