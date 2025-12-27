package basicconcepts;

import java.util.Arrays;

public class stringdemo {
	public static void main(String[] args) {
		
		String name=" Nik hil Shi nde ";
		
		System.out.println("String is: "+name);
		System.out.println("Length of string is: "+name.length());
		System.out.println("Uppercase: "+name.toUpperCase());
		System.out.println("Lowercase is: "+name.toLowerCase());
		System.out.println("Equals: "+name.equals("nikhil"));
		System.out.println("Char at: "+name.charAt(5));
		System.out.println("Index of"+name.indexOf("k"));
		System.out.println("Ends with: "+name.endsWith("e"));
		System.out.println("Starts eith: "+name.startsWith("N"));
		System.out.println("Replace: "+name.replace("k", "l"));
		System.out.println("Concat: "+name.concat("SoftwareDeveloper"));
		System.out.println("Substring: "+name.substring(6));
		System.out.println("Substring with brgin and end: "+name.substring(3, 6));
		System.out.println("Trim :"+name.trim());
		
		char arr[]=name.toCharArray();
		System.out.println("tochararray: "+Arrays.toString(arr));
		
		String sarray[]=name.split("/s");
		System.out.println("Split:" +Arrays.toString(sarray));
		
		System.out.println("Replace all:"+name.replaceAll("\s","*"));
	}	
}

