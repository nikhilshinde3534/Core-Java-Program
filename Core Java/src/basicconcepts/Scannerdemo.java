package basicconcepts;

import java.util.Scanner;

public class Scannerdemo{
	public static void main(String[] args)
	{
		System.out.println("Enter your Name : ");
		
		Scanner s=new Scanner (System.in);
		s.next();
		
		System.out.println("Enter your Surname : ");
		s.next();
		
		System.out.println("Enter Mobile No. : ");
		s.nextLong();
		
		System.out.println("Enter Email : ");
		s.next();
		
		System.out.println("Registration Succesfully Completed");
		
	}

}
