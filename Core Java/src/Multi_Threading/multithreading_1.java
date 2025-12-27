package Multi_Threading;

//1.Extends the thread class
public class multithreading_1 extends Thread
{
	//2.Override run method or Write down the run method for perticular subtask
	public void run()
	{
		System.out.println("Thread 1 is running");
	}
	
	public static void main(String[] args) {
		//3.Create the object of class
		multithreading_1 t1=new multithreading_1();
		//4.Execute the thread 
		t1.start();
	}
}

