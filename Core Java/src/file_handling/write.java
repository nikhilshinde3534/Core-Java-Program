package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class write {

	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\HP\\OneDrive\\Desktop\\Fortune Cloud\\write.txt");
		f.createNewFile();
		FileWriter fw=new FileWriter(f);
		fw.write("Hello");
		fw.close();
		System.out.println("File Written Successfully....!");
		
	}
}



