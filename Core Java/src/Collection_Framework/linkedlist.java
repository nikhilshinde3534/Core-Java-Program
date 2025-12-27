package Collection_Framework;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		l.add("nikhil@77gmail.com");
		l.add(567);
		l.add("Nikhil");
		l.add("#");
		
		System.out.println(l.offer(76));
		l.add(81.2);
		System.out.println("Peek : "+l.peek());
		System.out.println("Poll : "+l.poll());
		System.out.println("LinkedList : "+l);
	}
}


