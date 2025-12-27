package assignment;

import java.util.Scanner;

public class positivenegativeelseifladder {
	public static void main(String[] args) {
		System.out.println("Enter the number:");
		
		Scanner sc=new Scanner(System.in);
		int number = sc.nextInt();
		
		if(number>=0)
		{
			System.out.println("Number is Positive");
		}
		else if(number<=0)
		{
			System.out.println("Number is Negative");
		}
		else if(number==0)
		{
			System.out.println("Number is Equal to Zero");
		}
		else
		{
			System.out.println("Number is ot define");
		}
	}

}
