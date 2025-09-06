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

@WebServlet("/mahamai")
public class MahaMaiLoginServlet extends HttpServlet{
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		System.out.println("Servlet Connected ");
		
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		
		System.out.println(name);
		System.out.println(password);
		
		MahamaiVerification v1 = new MahamaiVerification();
		boolean result = v1.isValid(name, password);
		
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Ritik Loves Shweta");
		a1.add("Ritik Shweta Tamre");
		a1.add("Shweta is a Good Wife");
		a1.add("Shweta Kalua");
		
		
		PrintWriter out = res.getWriter();
		HttpSession s1 =req.getSession();
		s1.setAttribute("name", a1);
		
		if(result == true)
		{
			RequestDispatcher rd = req.getRequestDispatcher("mahamai-credit");
			rd.forward(req, res);
			out.println("<h1>Jai Shree Shyam</h1>");
		}
		else
		{
			out.println("Invalid");
		}
	}
 
}
