package demo;

public class VerificationPractice1 {

	
	public boolean isValid(String name,String password)
	{
		boolean result;
		
		DCPractice1 d1 = new DBCPractice1();
		result = d1.isUserAvailavle(name, password);
		
		if(result == true)
		{
			System.out.println("Valid");
			System.out.println("Radhe Radhe");
		}
		
		else
		{
			System.out.println("Invalid");
			System.out.println("Next Try");
		}
		return result;
	}
}
