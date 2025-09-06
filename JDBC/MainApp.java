package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainApp {

	public static void main(String[] args) {
		
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Protocol:subprotocal:db-specific information
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/febmarchmerged","root","7780");
		  String query="select * from employee";
		
		    Statement stmt=con.createStatement();
		    ResultSet rs=stmt.executeQuery(query);
		    
		    rs.next();
		    System.out.println(rs.getString(1));
		    con.close();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
