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

@WebServlet("/practice1")
public class Practice1Servlet extends HttpServlet{
   
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		System.out.println("Servlet Connected");
		
		String name=req.getParameter("username");
		String password =req.getParameter("password");
		
		System.out.println(name);
		System.out.println(password);
		
		VerificationPractice1 v1 = new VerificationPractice1();
		boolean result = v1.isValid(name, password);
		
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Ram Jii");
		a1.add("Mere Shyam Ji");
		
		PrintWriter out = res.getWriter();
		
		HttpSession s1 = req.getSession();
		s1.setAttribute("names", a1);
		
		
		if(result == true)
		{
			RequestDispatcher rd = req.getRequestDispatcher("credit-practice1");
			rd.forward(req, res);
		}
		else
		{
			out.println("Invalid");
		}
	}
}
