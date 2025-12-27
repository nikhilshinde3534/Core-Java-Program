package assignment;

import java.util.Scanner;

public class minicalculater {
	public static void main(String[] args) 
	{
		int a, b;
		Scanner s=new Scanner (System.in);
		
		System.out.println("Enter First Number  : ");
		a = s.nextInt();
		
		System.out.println("Enter Second Number : ");
		b = s.nextInt();
		
		System.out.println("Addition is : " +(a+b));
		System.out.println("Subtraction is : " +(a-b));
		System.out.println("Multiplication is : " +(a*b));
		System.out.println("Division is : " +(a/b));					
	}
}
