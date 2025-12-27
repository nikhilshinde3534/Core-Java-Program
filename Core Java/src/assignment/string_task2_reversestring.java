package assignment;

import java.util.Scanner;

public class string_task2_reversestring {

	public static void main(String[] args) {
		
		String s;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		s=sc.nextLine();
		
		char arr[]=s.toCharArray();
		
		System.out.println("Reverse Strinh is: ");
		for(int i=arr.length-1; i>=0;i--)
		{
			System.out.print(arr[i]);
		}
	}
}
