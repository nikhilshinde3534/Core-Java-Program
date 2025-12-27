package assignment;

import java.util.Scanner;

public class positivenegativecondition {
	public static void main(String[] args) {
		System.out.println("Enter The Number:");
		
		Scanner sc=new Scanner (System.in);
		int number = sc.nextInt();
	
		if(number>=0)
		{
			System.out.println("Positive Number");
		}
		else
		{
			System.out.println("Negative Number");

		}
	}

}
