package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc1 {

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
		
		// 3.Create a Statement
		
		String create_table="create table studentdata(id int, name varchar(100))";
		Statement st = con.createStatement();
		System.out.println("3.Statement is created...!!");
		
		// 4.Execute the Statement
		
		st.executeUpdate(create_table);
		System.out.println("4.Query executed...!!");
		
		// 5.Close the Connection
		
		con.close();
		System.out.println("5.Connection close...!!");
	}
}


