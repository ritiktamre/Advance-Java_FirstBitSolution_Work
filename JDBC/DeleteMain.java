package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteMain {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/RK","root","7780");
			String query="delete from rittu where password=111";
			
			Statement stmt = con.createStatement();
			int UpdateRowCount = stmt.executeUpdate(query);
			
			if(UpdateRowCount > 0)
			{
				System.out.println("Rows Affected :"+UpdateRowCount);
			}
			else
			{
				System.out.println("Not Rows Affected");
			}
			
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