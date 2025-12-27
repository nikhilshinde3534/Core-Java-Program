package exception_handling;

import java.util.Scanner;

public class throw_keyword {

	public static void main(String[] args) throws InvalidAadharNoException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age : ");
		
		int age=sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			throw new InvalidAadharNoException("Not Eligible for voting");
		}
	}
}

