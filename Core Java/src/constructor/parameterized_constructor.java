package constructor;

public class parameterized_constructor {
	
	parameterized_constructor(int a)
	{
		System.out.println("Hello Pune");
	}
	
	parameterized_constructor(int a,int b,int c)
	{
		System.out.println("Multiplication is : " +(a*b*c));
	}
	
	parameterized_constructor(int a,int b,int c, int d)
	{
		System.out.println("Add is : " +(a+b+c+d));
	}
	
	public static void main(String[] args) {
		
		parameterized_constructor p=new parameterized_constructor(2);;
		parameterized_constructor p2=new parameterized_constructor(2,3,4);
		parameterized_constructor p3=new parameterized_constructor(4,8,12,6);
	}
}


