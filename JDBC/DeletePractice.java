package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeletePractice {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/febmarchmerged","root","7780");
			
			String query = "delete from employee where e_id in (13,198,101)";
			
			Statement stmt = con.createStatement();
			
			int UpdateRowCount = stmt.executeUpdate(query);
			if(UpdateRowCount > 0)
			{
				System.out.println("Rows Affected :"+UpdateRowCount);
			}
			
			else
			{
				System.out.println("Failed");
			}
			
			stmt.close();
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
