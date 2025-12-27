package Oops;

public class employee extends company{

	void info()
	{
		super.info();
		System.out.println("Employee ID : 101");
		System.out.println("Employee Name : Nikhil");
		System.out.println("Employee Position : Software Developer");

	}
	
	public static void main(String[] args) {
		employee obj=new employee();
		obj.info();
	}
}

