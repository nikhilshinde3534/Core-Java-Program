package file_handling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class read {

	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\HP\\OneDrive\\Desktop\\Fortune Cloud\\write.txt");
		
		char[] r=new char[50];
		// FileReader fr=new FileReader(f);
		
		Scanner s=new Scanner(f);
		while(s.hasNext())
		{
			String d=s.nextLine();
			System.out.println(d);
		}
		s.close();
	}
}

