package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;


public class DBC15Aug implements DC15Aug{
 
	public boolean checkUser(String name,String password)
	{
		   boolean result = false ;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/India","root","7780");
			String query = "select * from bharat where name=? and password=?";
			
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, password);
			
			ResultSet rs = pstmt.executeQuery();
			return rs.next();
			
		} 
		
		catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean isUserAvailable(String a1, String a2) {
		
		return checkUser(a1, a2);
	}
}
