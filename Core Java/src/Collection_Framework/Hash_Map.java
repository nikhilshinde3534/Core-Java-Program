package Collection_Framework;

import java.util.HashMap;

public class Hash_Map {

	public static void main(String[] args) {
		
		// Nongeneric Collection 
		
		HashMap h = new HashMap();
		h.put(101, "Nikhil");
		h.put(102, 'S');
		h.put(103, 9987654345l);
		
		System.out.println("Nongeneric collection of HashMap : "+h);
		
		System.out.println("Contains Value : "+h.containsValue('S'));
		
		System.out.println("Contains Key : "+h.containsKey(103));
	
		System.out.println("Key set : "+h.keySet());
		
		System.out.println("Remove Key : "+h.remove(101));
	}
}



