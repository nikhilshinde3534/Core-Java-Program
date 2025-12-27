package Oops;

public class Child extends Parent{

	void second()
	{
		System.out.println("Child Property");
	}
	public static void main(String[] args) {
		
		Child ob=new Child();
		ob.second();
		ob.first();
	}
}



