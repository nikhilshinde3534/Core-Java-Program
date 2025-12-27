package access_specifier;

public class B extends A{

	void animals()
	{
		System.out.println("Animals name are cat, dog,etc");
	}
	
	public static void main(String[] args) {
		B obj=new B();
		obj.animals();
		obj.birds();
	}
}
