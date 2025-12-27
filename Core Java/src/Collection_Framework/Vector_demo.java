package Collection_Framework;

import java.util.Iterator;
import java.util.Vector;

public class Vector_demo {

	public static void main(String[] args) {
		
		Vector<Integer> rollno = new Vector<Integer>();
		rollno.add(90);
		rollno.add(56);
		rollno.add(80);
				
		// Iterator the object of collection change the value of index 1 to 60
		
		rollno.set(1, 60);
		
		for(Integer i:rollno)
		{
			System.out.println(i);
		}
	}
}



// Take a 5 flowers in collection where collection object is remove it and then print the collection 
// Take the 7 city name collection and in collection change the city name of pune to hydrabad
// Hashset generic and non-generic


