package demo;

public class VerificationMahakal {

	public boolean isValid(String username,String password)
	{
		boolean result;
		
		DCMahakal dc=new DBCMahakal();
		result=dc.checkUser(username,password);
		
		if(result==true)
		{
			System.out.println("<h1>Jai Shri Mahakal</h1>");
		}
		else
		{
			System.out.println("Invalid");
		}
		
		return result;
	}


}
