class ExpressWrap
{
	int a,b,c,d,e;

	float x,y;

	ExpressWrap(int p , int q , int r , int s , int  t , float u , float v)
	{
		a=p;
		b=q;
		c=r;
		d=s;
		e=t;
		x=u;
		y=v;
	}

	void check()
	{
		int ans1 = a * b + c /d;
		int ans2 = a * (b + c) / d;
		float ans3 = a / c;
		float ans4 = (float)a / c;
		float ans5 = a/y;
		int ans6 = a %c;
		float ans7 = x%y;

		boolean bool1 = a > b && c > d;
		boolean bool2 = a < b && c > d;
		boolean bool3 = a < b || c > d;
		boolean bool4 = !(a - b == c);

		System.out.println("ORDER OF EVALUATION");
		System.out.println("a * b + c / d = " +ans1);
		System.out.println("a * (b + c) / d = " +ans2);
		System.out.println("TYPE CONVERSIONS");
		System.out.println("a/ c = " + ans3);
		System.out.println("(float)a / c = " + ans4);
		System.out.println("a / y = " + ans5);
		System.out.println("a % c = " +ans6);
		System.out.println("x % y = " + ans7);
		System.out.println("LOGICAL OPERATIONS");
		System.out.println("a > b && c > d = " + bool1);
		System.out.println("a < b && c > d = " +bool2);
		System.out.println("a < b || c > d = " +bool3);
		System.out.println("!(a - b == c) = " + bool4);
		System.out.println("BITWISE OPERATIONS");
		System.out.println("d << 2 = " + (d<<2));
		System.out.println("e >> 2 = " + (e>>2));
		System.out.println("e >>> 2 = " + (e>>>2));
	}

	public static void main(String a[])
	{
		ExpressWrap e = new ExpressWrap(1,5,4,2,6,3.0f,8.0f);
		e.check();
	}
}



/*

	OUTPUT


C:\TYIF21>javac ExpressWrap.java

C:\TYIF21>java ExpressWrap
ORDER OF EVALUATION
a * b + c / d = 7
a * (b + c) / d = 4
TYPE CONVERSIONS
a/ c = 0.0
(float)a / c = 0.25
a / y = 0.125
a % c = 1
x % y = 3.0
LOGICAL OPERATIONS
a > b && c > d = false
a < b && c > d = true
a < b || c > d = true
!(a - b == c) = true
BITWISE OPERATIONS
d << 2 = 8
e >> 2 = 1
e >>> 2 = 1

*/