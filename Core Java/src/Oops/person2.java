package Oops;

public class person2 {

	void walk()
	{
		System.out.println("Walking.....!");
	}
	
	void run()
	{
		this.walk();
		System.out.println("Running.....!");
	}
	
	public static void main(String[] args) {

		person2 ob=new person2();
		ob.run();
	}
}
