package demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/maa")
public class MaaServlet extends HttpServlet{
   
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		System.out.println("Servlet Connected1");
		
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		
		System.out.println(username);
		System.out.println(password);
		
		VerificationMaa v1 = new VerificationMaa();
		boolean result=v1.isValid(username, password);
		
		List<String> l1 = new ArrayList<String>();
		l1.add("Ritik");
		l1.add("Rahul");
		l1.add("Yogesh");
		
		PrintWriter out = res.getWriter();
		
		HttpSession ses=req.getSession();
		ses.setAttribute("listofname",l1);
		System.out.println(ses.getId());
		
		
		if(result==true)
		{
			RequestDispatcher rd = req.getRequestDispatcher("maacredit");
			rd.forward(req, res);
		}
		
		else
		{
			out.println("Invalid");
		}
	}
}
