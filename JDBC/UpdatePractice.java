package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdatePractice {

	public static void main(String[] args) {
		
		try {
			Class .forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/febmarchmerged","root","7780");
			
			String query = "update employee set e_id=123,e_name = 'Shweta', email_id = 'shweta@gmail.com', salary = 20000, " +
                    "dept_id = 2, salary_category = 'very low' where e_id = -14";

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
