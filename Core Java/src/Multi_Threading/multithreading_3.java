package Multi_Threading;

public class multithreading_3 implements Runnable{
	
	public void run()
	{
		System.out.println("Running Task");
	}
	
	public static void main(String[] args) {
		
		multithreading_2 th2 = new multithreading_2(); //New
		
		Thread thr2 = new Thread(th2); // Creating object of thread class
		thr2.start();
	}
}


