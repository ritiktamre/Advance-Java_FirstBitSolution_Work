package demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/rs")
public class RsServlet extends HttpServlet {

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		System.out.println("Servlet Connected");
		
		String name=req.getParameter("username");
		String password=req.getParameter("password");
		
		System.out.println(name);
		System.out.println(password);
		
		VerificationRs v1 = new VerificationRs();
		boolean result = v1.isValid(name, password);
		
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Ram");
		a1.add("Shyam");
		a1.add("Radhe");
		
		PrintWriter out = res.getWriter();
		
		HttpSession h1 = req.getSession();
		h1.setAttribute("names", a1);
		
		if(result == true)
		{
			RequestDispatcher rd = req.getRequestDispatcher("credit-rs");
			rd.forward(req, res);
			
			out.println("<h1>Valid</h1>");
		}
		else
		{
			out.println("Invalid");
		}
	}
	
	
}
