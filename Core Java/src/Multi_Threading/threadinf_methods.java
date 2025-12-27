package Multi_Threading;

public class threadinf_methods {

	public static void main(String[] args) {
		
		Thread t1=new Thread();
		
		t1.setName("audio_thread");
		System.out.println("Name : "+t1.getName());
		
		t1.setPriority(3);
		System.out.println("Priority : "+t1.getPriority());
		
		System.out.println("Id : "+t1.getId());
		System.out.println("Min : "+Thread.MIN_PRIORITY);
		System.out.println("Norm : "+Thread.NORM_PRIORITY);
		System.out.println("Max : "+Thread.MAX_PRIORITY);
		
		System.out.println(t1.isAlive());
		System.out.println(t1.isVirtual());
		System.out.println(t1.isDaemon());

	}
}
