package assignment;

import java.util.Scanner;

public class string_index {
	public static void main(String[] args) {
		
		//find character at index 5
		
		System.out.println("Enter the string: ");
		Scanner sc=new Scanner(System.in);
		String s = sc.next(); 
		 
		System.out.println("Enter the index: ");
		int index=sc.nextInt();
		
		char chrr[]=s.toCharArray();//c,r,a,v,i,t,a
		for(int i=0; i<chrr.length; i++)
		{
			if(index==i)
			{
				System.out.println(chrr[i]);
			}
		}
	}
}
