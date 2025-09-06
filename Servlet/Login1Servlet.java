package demo;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login1authenticate")
public class Login1Servlet extends HttpServlet {

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		System.out.println("Servlet Connected");
		
		String user=req.getParameter("userName");
		String pass=req.getParameter("password");
		
		System.out.println(user);
	   System.out.println(pass);
	   
		Verification verify=new Verification();
		boolean result=verify.isValid(user, pass);
		
		PrintWriter out = res.getWriter();
		if(result==true)
		{
			out.println("<h1>Radhe Radhe</h1>");
		}
		else
		{
			out.println("Invalid");
		}
		//Get the data out of the request
		//Convert into an object if required
		//Pass this data to the bussiness logic
		
		
		//Decide which view to show based on the result recieved
		//from bussiness logic
	}

}
