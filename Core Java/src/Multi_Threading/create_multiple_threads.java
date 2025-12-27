package Multi_Threading;

public class create_multiple_threads extends Thread{
	
	public void run()
	{
		table();
		System.out.println("----------------------------------");
		try
		{
			Thread.sleep(4000);
		}
		catch (InterruptedException e)
		{
			System.out.println();
		}
	}	
		void table()
		{
			
		}
		void positivenegative()
		{
			int number=9;
			if(number>0)
			{
				System.out.println("The number is Positive ");
			}
			else if(number<0)
			{
				System.out.println("The number is Negative");
			}
			else
			{
				System.out.println("The number is zero");
			}
		}
	
}	
	
	public static void main(String[] args) {
		
		create_multiple_threads t1 = new create_multiple_threads();
		t1.start();
	}

}
