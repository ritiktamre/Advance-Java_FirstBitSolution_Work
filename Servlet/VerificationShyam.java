package demo;

public class VerificationShyam {

	public boolean isValid(String name,String password)
	{
		boolean result ;
		DataConnectShyam d1 = new DBConnectionShyam();
		result=d1.checkUser(name,password);
				
		
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
