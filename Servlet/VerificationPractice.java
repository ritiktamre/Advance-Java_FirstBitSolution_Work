package demo;

public class VerificationPractice {

	public boolean isValid(String name,String password)
	{
		boolean result;
		DCPractice d1 = new DBCPractice();
		result=d1.isUserAvailable(name, password);
		
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
