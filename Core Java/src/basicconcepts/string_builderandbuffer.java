package basicconcepts;

public class string_builderandbuffer {

	public static void main(String[] args) {
		
		System.out.println("__________________String Builder___________________________");
	
		StringBuilder str1=new StringBuilder("good");
		System.out.println("Before append: " +str1);
		System.out.println("Using append: " +str1.append("Student"));
		System.out.println("After append: "+str1);
		System.out.println("After reverse: " +str1.reverse());
		System.out.println("index of: "+str1.indexOf("o"));
		System.out.println("Charat: " +str1.charAt(0));
		System.out.println("Index of substring: " +str1.indexOf("t",1));
		System.out.println(str1.insert(0, "Nikhil"));
		str1.delete(0, 6);
		System.out.println("String is: " +str1);
		System.out.println(str1.repeat(str1, 8));
		
		System.out.println("__________________String Buffer____________________________");
		
		StringBuffer str2=new StringBuffer("bad");
		System.out.println("Before append: " +str2);
		System.out.println("Using append: " +str2.append("Student"));
		System.out.println("After append: "+str2);
	
	}
}



