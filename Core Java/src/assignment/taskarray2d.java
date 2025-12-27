package assignment;

public class taskarray2d {
    public static void main(String[] args) {
        
        String arr[][] = { 
            {"Id", "Name", "Surname"},
            {"1", "Nikhil", "Shinde"},
            {"2", "Omkar", "Pawar"}
        };
        
        for(int i = 0; i < arr.length; i++) 
        {
            for(int j = 0; j < arr.length; j++) 
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

