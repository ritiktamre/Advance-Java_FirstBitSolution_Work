package demo;

public class VerificationRam {

	public boolean isValid(String name,String password)
	{
		boolean result;
		
		DataConnectRam d1 = new DBConnectionRam();
		result = d1.checkUser(name,password);
		
		if(result == true)
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("Invalid");
		}
		
		return result;
	}
}
