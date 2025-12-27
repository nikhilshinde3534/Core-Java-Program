package exception_handling;

public class finally_demo {

	public static void main(String[] args) {
		
		try
		{
			int a=4/0;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally Block Executed....!!!");
		}
		System.out.println("Bye....!");
	}
}

