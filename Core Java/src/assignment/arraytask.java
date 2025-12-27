package assignment;

import java.util.Scanner;

public class arraytask {
    // Print the array of cities entered by user
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the city Size: ");
        int n = sc.nextInt();
        
        String city[] = new String[n];
        System.out.println("Enter the city names: ");
        
        for (int i = 0; i < city.length; i++) 
        {
            city[i] = sc.next();
        }
        
        System.out.println("\nList of cities:");
        for (int i = 0; i < city.length; i++) 
        {
            System.out.println(city[i]);
        }

    }
}
