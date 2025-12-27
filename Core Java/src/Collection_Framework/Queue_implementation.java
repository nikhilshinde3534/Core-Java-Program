package Collection_Framework;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_implementation {

	public static void main(String[] args) {
		
		Queue q = new ArrayDeque();
		q.add("Nikhil");
		q.add(800);
		q.add("Pune");
		q.add(564534.8);
		System.out.println("Queue is : "+q);
		
		System.out.println("Head object of queue : "+q.element());
		
		q.offer('%');
		System.out.println("After queue is : "+q);

		System.out.println("Peek : "+q.peek());
		System.out.println("After Peek is : "+q);
		
		System.out.println("Poll : "+q.poll());
		System.out.println("After Poll is : "+q);
	}
}

