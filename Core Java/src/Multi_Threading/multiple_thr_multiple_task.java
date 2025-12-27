package Multi_Threading;

class test extends Thread
{
	public void run()
	{
		System.out.println("Task 1 is executing");
	}
}
public class multiple_thr_multiple_task extends Thread{

	public void run()
	{
		System.out.println("Task 2 is executing");
	}
	public static void main(String[] args) {
		
		multiple_thr_multiple_task th1 = new multiple_thr_multiple_task();
		test th2 = new test();
		
		th1.start();
		th2.start();
	}
}
