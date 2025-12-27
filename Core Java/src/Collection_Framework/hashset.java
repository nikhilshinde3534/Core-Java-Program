package Collection_Framework;

import java.util.HashSet;
public class hashset {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		hs.add("Nikhil");  // 1.add method
		hs.add(24);
		hs.add(24);
		hs.add(56.1);
		hs.add(null);
		hs.add(null);
		

		
		System.out.println("Hashset is : "+hs);
		System.out.println("Contains : "+hs.contains("Shinde")); // 2.contains method

		hs.remove(24);  // 3.remove object from collection
		System.out.println("After removing object hashset is : "+hs);
		
		System.out.println("is empty : "+hs.isEmpty()); // 4.isempty
		
		hs.clear(); // 5.clear
		System.out.println("Hashset is : "+hs);
	}
}


