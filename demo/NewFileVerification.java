package demo;

public class NewFileVerification {

	boolean result ;
	
	public boolean isValid(String name,String password)
	{
	
	NewFileDataConnect c1 = new NewFileDatabaseConnectivity();
	result = c1.isUserAvailable(name, password);
			
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
