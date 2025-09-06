package demo;

public class Verification15Aug {
   
	public boolean isValid(String name,String password)
	{
		boolean result;
		
		DC15Aug d1 = new DBC15Aug();
		result = d1.isUserAvailable(name, password);
		
		if(result == true)
		{
			System.out.println("Valid Radhe Radhe ");
		}
		
		else
		{
			System.out.println("Invalid");
		}
		return result;
	}
}
