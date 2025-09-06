package demo;

public class MahamaiVerification {

	public boolean isValid(String name,String password)
	{
		MahamaiDataConnect dc = new MahaMaiDataBaseConnectivity();
		boolean result = dc.userAvailable(name, password);
		
		if(result == true)
		{
			System.out.println("<h1>Hare Ka Sahara Baba Shyam Hamara</h1>");
		}
		
		else
		{
			System.out.println("Invalid");
		}
		return result;
	}
}
