package demo;

public class VerificationMaa {
    
	public boolean isValid(String username,String password)
	{
		boolean result;
		DCMaa d1 = new DBCMaa();
		result=d1.checkUser(username,password);
		
		if(result==true)
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("InValid");
		}
		
		return result;
	}

//	public boolean isValid(String username, String password) {
//		// TODO Auto-generated method stub
//		return false;
//	}
}
