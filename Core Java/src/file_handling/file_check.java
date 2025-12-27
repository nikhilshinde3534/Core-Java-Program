package file_handling;

import java.io.File;

public class file_check {

	public static void main(String[] args) {
		
		File f=new File("C:\\Users\\HP\\OneDrive\\Desktop\\Fortune Cloud");
		
		if(f.exists())
		{
			FileWritter fe=new FileWritter(f);
			fw.write("Good Morning");
			fw
		}
		else
		{
			System.out.println("File is does not exist");
		}
	}
}
