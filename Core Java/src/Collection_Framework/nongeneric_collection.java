package Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class nongeneric_collection {

	public static void main(String[] args) {
		
		List student_data=new ArrayList();
		
		student_data.add(50);
		student_data.add("Nikhil");
		student_data.add(9.20);
		student_data.add('A');
		student_data.add("Engineer");
		student_data.add(1, 7499765936l);
		student_data.addFirst("Pune");
		student_data.addLast("Shinde");
		System.out.println("Contains: "+student_data.contains("pun"));
		
		//Clear, get, indexof, getlast, getfirst, isempty, lastindexof
		//remove(byindex), remove(byobject), removefirst, removelast, reversed
		//set, size, sort

		System.out.println(student_data.lastIndexOf("Software Developer"));
		System.out.println(student_data);
	}
}
