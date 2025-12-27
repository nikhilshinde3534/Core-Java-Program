package exception_handling;

import java.util.Scanner;

public class aadhar_number {

	public static void main(String[] args) throws InvalidAadharNoException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Aadhar Number : ");
		String num=sc.next();
		
		if(num.length() !=12)
		{
			throw new InvalidAadharNoException("Invalid Aadhar Number");
		}
		else
		{
			System.out.println("Valid Aadhar Number : " +num);
		}
	}
}



