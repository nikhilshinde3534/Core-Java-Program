package assignment;

import java.util.Scanner;

public class task1 {
	
	//Check Weather the number is odd or even
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Given number is EVEN");
		}
		else
		{
			System.out.println("Given number is ODD");
		}	
	}
}
