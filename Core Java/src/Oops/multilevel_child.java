package Oops;

public class multilevel_child extends multilevel_parent {

	void cp()
	{
		System.out.println("Child class");
	}
	public static void main(String[] args) {
		multilevel_child obj=new multilevel_child();
		obj.cp();
		obj.mp();
		obj.mgp();
	}
}
