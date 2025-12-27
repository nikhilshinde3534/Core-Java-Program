package Collection_Framework;

import java.util.Stack;

public class stack_implementation {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		// Used to add element in stack  :- LIFO
		s.push(34);
		s.push("Nikhil");
		s.push(9.8);
		s.push(true);
		s.push("#");
		
		System.out.println("Stack is : "+s);
		
		// Used to remove object from the stack
		s.pop();
		System.out.println("After pop stack is : "+s);
		
		// Used to remove random object
		s.remove(1);
		System.out.println("After remove stack is : "+s);
		
		System.out.println("Stack Capacity : "+s.capacity());
		
		System.out.println("After peek stack is : "+s.peek());
		
		System.out.println("After Search : "+s.search(34));

	}
}

