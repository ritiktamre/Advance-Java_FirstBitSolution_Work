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

@WebServlet("/RadheShyam")
public class RadheShyamLoginServlet extends HttpServlet{
  
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		System.out.println("Servlet Connected");
		
		String name=req.getParameter("username");
		String password=req.getParameter("password");
	
		System.out.println(name);
		System.out.println(password);
		
		RadheShyamVerification v1 = new RadheShyamVerification();
		boolean result = v1.isValidUser(name, password);
		
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Ritik - Khatik Pariwaar");
		a1.add("Ritik- Shyam Pariwar");
		a1.add("Ritik-Tamre Pariwar");
		
		
				
		PrintWriter p1 = res.getWriter();
		
		HttpSession s1 = req.getSession();
		s1.setAttribute("names", a1);
		
		if(result==true)
		{
			RequestDispatcher rd = req.getRequestDispatcher("RadheShyamcredit");
			rd.forward(req, res);
			p1.println("<h1>Valid</h1>");
		}
		else
		{
			p1.println("InValid");
		}
	}
}
