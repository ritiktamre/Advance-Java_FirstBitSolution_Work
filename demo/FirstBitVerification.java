package demo;

public class FirstBitVerification {
  
	public boolean isValid(String name,String password)
	{
	FirstBitDC dc = new FirstBitDBC();
	
	boolean result = dc.checkUser(name,password);
	
	if(result == true)
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