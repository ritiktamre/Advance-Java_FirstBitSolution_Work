package demo;

public class VerificationRadhe {

	public boolean isValid(String name,String password)
	{
		boolean result;
		
		DataConnectRadhe d1= new DBConnectionRadhe();
		
		result=d1.checkUser(name,password);
		
		if(result==true)
		{
			System.out.println("<h1>Radhe Radhe</h1>");
		}
		else
		{
			System.out.println("Invalid");
		}
		
		return result;
	}
}
