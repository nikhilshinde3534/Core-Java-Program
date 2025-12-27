package Oops;

class A
{
	void displayA()
	{
		System.out.println("Class A");
	}
}

class B extends A
{
	void displayB()
	{
		System.out.println("Class B");
	}
}

class C extends A
{
	void displayC()
	{
		System.out.println("Class C");
	}
}
	
class D extends B
{
	void displayD()
	{
		System.out.println("Class D");
	}
}

public class hy_college {

	public static void main(String[] args) {
		
		D ob = new D();
		ob.displayA();
		ob.displayB();
		ob.displayD();
		
		C ob1 = new C();
		ob1.displayA();
		ob1.displayC();
	}
}

