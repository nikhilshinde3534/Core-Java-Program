package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class perparedstatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// 1.Load class of JDBC Driver
		
		Class.forName("org.postgresql.Driver");
		System.out.println("1.JDBC driver loaded...!!");
					
		// 2.Create Connection Portnumber, Username, Password
				// rdbmsdriver://localhost:portnumber/databasename
		String URL="jdbc:postgresql://localhost:5433/java8sept";
		String username="postgres";
		String password="Nikhil77";
		Connection con = DriverManager.getConnection(URL, username, password);
		System.out.println("2.Connection is created...!!");
				
		// 3. Create a statement using preparedstatement
		
		PreparedStatement ps = con.prepareStatement("Insert into student values(?,?)");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Id : ");
		int id=sc.nextInt();
		
		System.out.println("Enter Name : ");
		int name=sc.nextInt();
		
		ps.setInt(1, id);
		ps.setLong(2, name);
		System.out.println("3.Statement is Created...!!");
		
		// 4. Execute the query
		
		ps.executeUpdate();
		System.out.println("4.Executed Query...!!");
		
		// 5. Close the connection
		
		con.close();
		System.out.println("5.Close Connection...!!");

	}
}
