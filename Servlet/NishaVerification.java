package demo;

public class NishaVerification {

	public boolean isValid(String name,String password)
	{
		boolean result;
		NishaDC n1 = new NishaDBC();
		result=n1.checkUser(name, password);
		
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
