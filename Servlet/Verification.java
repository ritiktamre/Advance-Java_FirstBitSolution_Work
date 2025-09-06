package demo;

public class Verification {
  
	public boolean isValid(String user,String pass)
	{
		boolean result;
		DatabaseConnect con=new DatabaseConnect();
		result=con.checkUser(user, pass);
		if(result==true)
		{
			System.out.println("Radhe Radhe");
			return true;
		}
		else
		{
			System.out.println("Invalid");
		}
		return result;
	}
}
