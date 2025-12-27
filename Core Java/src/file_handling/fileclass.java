package file_handling;

import java.io.File;
import java.io.IOException;

public class fileclass {

	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\HP\\OneDrive\\Desktop\\Fortune Cloud\\thursday.txt");
		f.createNewFile();
		System.out.println("File is Created....!");
		System.out.println("Canwrite : "+f.canWrite());
		System.out.println("Canread : "+f.canRead());
		
		System.out.println("Exists : " +f.exists());
		System.out.println("Delete : " +f.delete());
		System.out.println("GetAbsolutePath : " +f.getAbsolutePath());
		System.out.println("GetPath : " +f.getPath());
		System.out.println("GetName : " +f.getName());
		System.out.println("IsFile : " +f.isFile());
		System.out.println("IsHidden : " +f.isHidden());
		System.out.println("Length : " +f.length());
		System.out.println("mkdir : " +f.mkdir());
		System.out.println("GetTotalSpace : " +f.getTotalSpace());
	}
}


