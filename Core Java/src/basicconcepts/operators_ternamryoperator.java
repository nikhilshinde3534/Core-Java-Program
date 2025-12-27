package basicconcepts;

import java.util.Scanner;

public class operators_ternamryoperator {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		
		String result = (age>18)?"You are Eligible for voting":"You are not Eligible for voting";
		System.out.println(result);
	}
}
