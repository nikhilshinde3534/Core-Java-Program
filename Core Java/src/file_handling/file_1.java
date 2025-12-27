package file_handling;

import java.io.File;
import java.io.IOException;

public class file_1 {

	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\HP\\OneDrive\\Desktop\\Fortune Cloud\\thursday.txt");
		
		if(f.createNewFile())
		{
			System.out.println("File is Created");
		}
		else
		{
			System.out.println("File is Already exists");
		}
	}
}

