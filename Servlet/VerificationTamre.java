package demo;

public class VerificationTamre {
  
	public boolean isValid(String name,String password)
	{
		boolean result;
		TamreDC t1 = new TamreDBC();
		result=t1.checkUser(name,password);
		
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
