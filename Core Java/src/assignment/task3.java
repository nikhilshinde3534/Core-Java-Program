package assignment;

import java.util.Scanner;

public class task3 {
	
	// Check whether user is eligible for voting or not
	
	public static void main(String[] args) {
		
		System.out.println("Enter the age:");
		Scanner sc=new Scanner (System.in);
		int age=sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("You are Eligible for Voting");
		}
		else
		{
			System.out.println("You are not Eligible for Voting");
		}
	}
}


