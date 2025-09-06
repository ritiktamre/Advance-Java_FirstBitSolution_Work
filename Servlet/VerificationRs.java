package demo;

public class VerificationRs {
 
	public boolean isValid(String name,String password)
	{
		boolean result;
		DataCRS d1 =new DBCRS();
		result = d1.checkUser(name, password);
		
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
