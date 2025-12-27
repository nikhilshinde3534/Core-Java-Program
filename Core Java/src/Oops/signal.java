package Oops;

public interface signal {

	abstract void color();
	
	default void location()
	{
		System.out.println("Pune");
	}
}


