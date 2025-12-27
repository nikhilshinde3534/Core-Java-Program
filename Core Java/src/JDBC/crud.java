package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class crud {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
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
		
		// 3.Create a statement
		String insert = "insert into student values(101,'Nikhil')";
		Statement s = con.createStatement();
		
		// 4. Execute the query
		s.executeUpdate(insert);
		
		// 5.Close the connection
		con.close();
	}
}
