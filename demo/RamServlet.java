package demo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ram-authenticate")
public class RamServlet extends HttpServlet{

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		System.out.println("Servlet Connected");
		
		String name=req.getParameter("username");
		String password=req.getParameter("password");
		
		System.out.println(name);
		System.out.println(password);
		
		VerificationRam v1 = new VerificationRam();
		boolean result=v1.isValid(name, password);
		
		PrintWriter out=res.getWriter();
		if(result==true)
		{
			out.println("<h1>Ram Ram</h1>");
		}
		else
		{
			out.println("Invalid");
		}
				
	}
}
