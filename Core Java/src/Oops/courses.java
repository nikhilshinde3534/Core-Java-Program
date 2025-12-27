package Oops;
class institute{
	void details()
	{
		System.out.println("---------------------Institute------------------");

		System.out.println("Fortune Cloud");
		System.out.println("Cravita technology");
		System.out.println("Mind Space");
	}
}
public class courses extends institute{

	public static void main(String[] args) {
		courses ob=new courses();
		ob.details();
		ob.info();
	}
	
	void info()
	{
		System.out.println("---------------------Courses------------------");
		System.out.println("Java");
		System.out.println("Python");
		System.out.println("Dot Net");
		System.out.println("Mern Stack");
	}
}



