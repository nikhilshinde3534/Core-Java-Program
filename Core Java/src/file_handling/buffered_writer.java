package file_handling;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class buffered_writer {

	public static void main(String[] args) throws Exception {
		
		BufferedWriter bw = new BufferedWriter(new FileWriter
				("C:\\Users\\HP\\OneDrive\\Desktop\\Fortune Cloud\\newfile.txt"));
		
		bw.write("Hello, Java...!");
		bw.newLine();
		bw.write("Buffer Writer Example");
		bw.close();
	}
}


