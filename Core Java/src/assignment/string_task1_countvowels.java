package assignment;

import java.util.Scanner;

public class string_task1_countvowels {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in); 
		
		System.out.println("Enter the String: "); 
		String s=sc.nextLine();
		
		int a=0;                                                       
		
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if(ch =='a'|| ch =='A' ||
			   ch =='e'|| ch =='E' ||
			   ch =='i'|| ch =='I' ||
			   ch =='o'|| ch =='O' ||
			   ch =='u'|| ch =='U')
			{
				a++;
			}
		}
		System.out.println("Number of vowels: " +a);
	}
}
