package assignment;

import java.util.Scanner;

public class dowhiletask {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Start Number: ");
		int lastnum=sc.nextInt();
		
		System.out.println("Enter the Last Number: ");
		int firstnum=sc.nextInt();
		
		int i=lastnum;
		
		do {
			System.out.println(i);
			i--;
		}while(firstnum>=i);
			
	}

}
