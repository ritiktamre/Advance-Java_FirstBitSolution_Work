package demo;

public class SabariaVerification {

	public boolean isValid(String name,String password)
	{
		boolean result ;
		
		SabariaDataConnect dc= new SabariaDataBaseConnection();
		result = dc.UserAvailable(name, password);
		
		if(result == true)
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("inValid");
		}
		return result;
				
	}
}
