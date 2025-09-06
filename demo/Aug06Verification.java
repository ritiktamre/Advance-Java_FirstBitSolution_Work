package demo;

public class Aug06Verification {
    
	public boolean isValidUser(String name,String password)
	{
		Aug06DC a1=new Aug06DBC(); 
		boolean result;
		result =a1.checkUser(name, password);
		
		if(result== true)
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("InValid");
		}
		return result;
		
	}
}
