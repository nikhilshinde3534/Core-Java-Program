package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class append {

	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\\\Users\\\\HP\\\\OneDrive\\\\Desktop\\\\Fortune Cloud\\\\newfile.txt");
		FileWriter fw=new FileWriter(f,true);
		fw.write(" Pune");
		fw.close();
		System.out.println("File Written successfully....!");
	}
}
