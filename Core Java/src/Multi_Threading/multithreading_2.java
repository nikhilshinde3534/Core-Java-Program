package Multi_Threading;

public class multithreading_2 extends Thread{
	
	public void run()
	{
		System.out.println("Running Thread");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Executed....!");
	}
	
	public static void main(String[] args) {
		multithreading_2 th1 = new multithreading_2();
		System.out.println(th1.getState()); // New
		th1.start();
		System.out.println(th1.getState()); // Runnable
		System.out.println("is alive for first time : "+th1.isAlive());
		
		System.out.println("is alive for second time : "+th1.isAlive());
		System.out.println(th1.getState()); // Terminated
	}
}


