package Collection_Framework;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_generic {

	public static void main(String[] args) throws InterruptedException {
		
		TreeSet<String> sweets = new TreeSet<String>();
		sweets.add("Jalebi");
		sweets.add("Ladu");
		sweets.add("Gulabjam");
		sweets.add("Pedha");
		sweets.add("Barfi");

		System.out.println("Sweets are : "+sweets);
		
		System.out.println("Contains : "+sweets.contains("Pedha"));

		// descending set, iterator, clear, getfirst, getlast
		System.out.println("Size : "+sweets.size());
		System.out.println("Floor : "+sweets.floor("Gajar halwa"));
		System.out.println("First : "+sweets.first());
		System.out.println("Lower : "+sweets.lower("rasmalai"));
		System.out.println("Higher : "+sweets.higher("Badam Shake"));
		
		System.out.println("Pollfirst : "+sweets.pollFirst());
		System.out.println("After pollfirst sweets are : "+sweets);
		
		System.out.println("PollLast : "+sweets.pollLast());
		System.out.println("After PollLast sweets are : "+sweets);
		
		System.out.println("Subset : "+sweets.subSet("Gulabjam", "Ladu"));
		System.out.println("isEmpty : "+sweets.isEmpty());
		System.out.println("Tailset : "+sweets.tailSet("Gulabjam"));
		
		// Iteration
		System.out.println("\nIterating....sweets....:");
		Iterator i = sweets.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}


