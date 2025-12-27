package file_handling;
import java.io.*;

public class buffer_reader {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new FileReader
        		("C:\\Users\\HP\\OneDrive\\Desktop\\Fortune Cloud\\newfile.txt"));
        
        String line;
        while ((line = br.readLine()) != null) 
        {
            System.out.println(line);
        }
        
        br.close();
    }
}




