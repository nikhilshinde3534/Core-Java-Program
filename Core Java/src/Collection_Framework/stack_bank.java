package Collection_Framework;
import java.util.Scanner;
import java.util.Stack;

public class stack_bank {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		Stack<String> bank = new Stack<String>();
		System.out.println("Enter the size of stack");
		int size = s.nextInt();
		
		
		System.out.println("Enter the bank names : ");
		for(int i=0;i<size;i++)
		{
			String bname = s.next();
			bank.push(bname);
		}
		
		System.out.println("Before removing Bank collection is : "+bank);
		// Check bank SBI
		for(int i=0;i<size;i++)
		{
			String b=bank.get(i);
			if(b.equalsIgnoreCase("SBI"))
			{
				bank.remove("SBI"); // Removing SBI bank 
			}
		}
		System.out.println("After removing Bank collection is : "+bank);
	}
}















