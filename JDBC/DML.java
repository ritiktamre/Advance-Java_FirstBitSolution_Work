package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DML {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Protocol:subprotocal:db-specific information
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/febmarchmerged","root","7780");
//			  String query="select * from employee";
			String query = "Insert into employee(e_id,e_name,email_id,salary,dept_id,salary_category) values(198,'Ritik','ritik@gmail.com',20000,2,'very low')";
			
			    Statement stmt=con.createStatement();
//			    ResultSet rs=stmt.executeQuery(query);
			    int UpdateRowCount =stmt.executeUpdate(query); 
			  
			    if(UpdateRowCount > 0) {
			    System.out.println("Rows Affected by :"+UpdateRowCount);
			    }
			    else
			    {
			    	System.out.println("Failed");
			    }
			    stmt.close();
			    con.close();
		} 
		catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
