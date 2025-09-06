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

@WebServlet("/practice")
public class PracticeServlet extends HttpServlet{
  
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		System.out.println("Servlet Connected");
		
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		
		System.out.println(username);
		System.out.println(password);
		
		VerificationPractice v1 = new VerificationPractice();
		boolean result =v1.isValid(username, password);
		
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Radhe");
		a1.add("Shyam");
		a1.add("Kahna");
		
		PrintWriter out = res.getWriter();
		HttpSession s1 = req.getSession();
		s1.setAttribute("name", a1);
		
		
	   
		if(result ==true)
		{
		    RequestDispatcher rd = req.getRequestDispatcher("practice-credit");
		    rd.forward(req, res);
		}
		else
		{
			out.println("Invalid");
		}
	}
}
