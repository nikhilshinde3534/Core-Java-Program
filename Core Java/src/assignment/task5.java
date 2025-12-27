package assignment;

import java.util.Scanner;

public class task5 {
	
	// print odd number series using user input
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter Starting Number:");
		int start = sc.nextInt();
		
		System.out.println("Enter Ending Number:");
		int end = sc.nextInt();
				
		for(int i=start; i<=end ;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
	}
}

