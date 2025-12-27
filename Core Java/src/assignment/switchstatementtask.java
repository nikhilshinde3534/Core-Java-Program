package assignment;

import java.util.Scanner;

public class switchstatementtask {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Character:");
		char ch=sc.next().charAt(0);
		
		switch(ch)
		{
		case 'a':case 'A':
		case 'e':case 'B':
		case 'i':case 'C':
		case 'o':case 'D':
		case 'u':case 'E':
			System.out.println("The given character u is Vowel");
			break;
		default:System.out.println("The given character is Consonants");
		}
	
	}
}
