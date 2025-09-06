package demo;

public class VerificationBappa {
  
	public boolean isValid(String name,String password)
	{
		boolean result;
		DCBappa d1=new DBCBappa();
		result=d1.checkUser(name,password);
		
		if(result==true)
		{
			System.out.println("Ganpati Bappa Moriya");
		}
		else
		{
			System.out.println("Invalid ");
		}
		
		return result;
	}
}
