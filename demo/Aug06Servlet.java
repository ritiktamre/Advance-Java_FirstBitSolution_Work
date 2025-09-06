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

@WebServlet("/Aug06")
public class Aug06Servlet extends HttpServlet {
 
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		System.out.println("Servlet Connected");
		String name=req.getParameter("username");
		String password=req.getParameter("password");
		
		System.out.println(name);
		System.out.println(password);
		
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Ritik-Tamre Family");
		a1.add("Ritik-Khatik");
		a1.add("Ritik-ShyamParivar");
		
		Aug06Verification v1 = new Aug06Verification();
		boolean result =v1.isValidUser(name, password);
		
		
		PrintWriter out=res.getWriter();
		HttpSession s1 = req.getSession();
		s1.setAttribute("name", a1);
		
		if(result==true) {
			RequestDispatcher rd = req.getRequestDispatcher("Aug06-credit");
			rd.forward(req, res);
			
			out.println("<h1>Valid</h1>");
		}
		else
		{
			out.println("Invalid");
		}
			
			
		
		
	}
}
