package Multi_Threading;

public class synchronization extends Thread{

	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
				System.out.println(Thread.currentThread().getName()+" :"+i);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		synchronization t1 = new synchronization();
		synchronization t2 = new synchronization();
		synchronization t3 = new synchronization();
		
		t1.start();
		t1.join(); // Wait until thread 1 is completing the task
		Thread.sleep(1000);
		t2.start();
		t2.join(); // Wait until thread is completing the task
		Thread.sleep(1000);
		t3.start();
	}
}


