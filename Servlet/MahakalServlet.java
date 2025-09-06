package demo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/mahakal")
public class MahakalServlet extends HttpServlet {

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		System.out.println("Servlet Connectd");
		
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		System.out.println(username);
		System.out.println(password);
		
		VerificationMahakal v1 = new VerificationMahakal();
		boolean result = v1.isValid(username, password);
		
		PrintWriter out = res.getWriter();
		if(result==true)
		{
			out.println("<h1>Jai Shri Mahakal</h1>");
		}
		else
		{
			out.println("Invalid");
		}
	}
}
