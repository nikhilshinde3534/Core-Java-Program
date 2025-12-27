package file_handling;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filestreamclasses {

	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\HP\\OneDrive\\Desktop\\Fortune Cloud\\newfile.txt");
		
		String name="Nikhil Shinde";
		
		char ch='5';
		FileOutputStream fos=new FileOutputStream(f);
		
		fos.write(name.getBytes());
		fos.write(ch);
		fos.close();
		System.out.println("File Written Successfully....!");
		
		//Fir reading the file
		System.out.println("Reading the file : ");
		FileInputStream fis=new FileInputStream(f);
		int i;
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}
	}
}


