package Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;

public class Generic_Collection {

	public static void main(String[] args) throws InterruptedException {
		
		ArrayList<String> name = new ArrayList<String>();
		name.add("Akshay");
		name.add("Nikhil");
		name.add("Akash");
		System.out.println("Generic Collection is : "+name);
		
		// Sorting
		name.sort(null);
		System.out.println("\nGeneric Collection after sorting is :"+name);
		
		
		// Iteration 
		Iterator it = name.iterator();
		System.out.println("\nSorting of Collection is : ");
		while(it.hasNext())
		{
			System.out.println(it.next());
			Thread.sleep(1000);
		}
	}
}	

