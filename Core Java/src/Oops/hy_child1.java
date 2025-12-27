package Oops;

public class hy_child1 extends hy_parent{

	void c1()
	{
		System.out.println("Child 1");
	}
	
	public static void main(String[] args) {
		
		hy_child1 ob = new hy_child1();
		ob.c1();
		ob.p1();
		
	}
}
