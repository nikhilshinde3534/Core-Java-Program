package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class resultsetdemo {

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
		
		// 3. Create Statement
		Statement s = con.createStatement();
		
		// 4.Execute Query
		String fetch = "select * from new";
		ResultSet rs = s.executeQuery(fetch);
		
		// 5.Retrive
		while(rs.next())
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
		}
		
		// 6.Close the connection
		con.close();
	}
}
