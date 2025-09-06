package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Aug06DBC implements Aug06DC{
   
	public boolean checkUser(String name,String password)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Rk","root","7780");
			String query = "select * from rittu where name=? and password =?";
			
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, password);
			
			ResultSet rs = pstmt.executeQuery();
			
			return rs.next();
		} 
		
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	
	}

	public boolean isUserAvailable(String v1, String v2) {
		// TODO Auto-generated method stub
		return checkUser(v1,v2);
	}
	
}
