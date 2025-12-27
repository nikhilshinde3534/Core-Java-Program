package assignment;

import java.util.Scanner;

public class task2 {
	public static void main(String[] args) {
		
		// Check the largest number among two number
		
		System.out.println("Enter the two number:");
		
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		
		if(a>b)
		{
			System.out.println(a + "is a largest Number");
		}
		else if (b>a)
		{
			System.out.println(b + " is a largest Number" );
		}
		else
		{
			System.out.print("Equal Numbers");
		}	
	}
}

