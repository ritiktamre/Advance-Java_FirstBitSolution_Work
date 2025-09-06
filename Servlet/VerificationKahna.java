package demo;

public class VerificationKahna {

	public boolean isValid(String name,String password)
	{
		DataConnectKahna d1 = new DBCKahna();
		boolean result=d1.checkUser(name, password);
		
		if(result==true)
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
