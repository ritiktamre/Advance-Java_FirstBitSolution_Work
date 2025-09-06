package demo;

public class RadheShyamVerification {
    
	public boolean isValidUser(String name,String password)
	{
		boolean result ;
		RadheShyamDC r1= new RadheShyamDBC();
	    result=r1.CheckUser(name, password);
		
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
