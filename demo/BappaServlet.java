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

@WebServlet("/bappa")
public class BappaServlet extends HttpServlet {

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
	     System.out.println("Sevlet Connected");	
	     
	   
	   
	     
	     String username=req.getParameter("username");
	     String password=req.getParameter("password");
	     
	     System.out.println(username);
	     System.out.println(password);
	     
	     VerificationBappa v1 = new VerificationBappa();
	     boolean result=v1.isValid(username, password);
	     
	     
	     ArrayList<String> a1 = new ArrayList<String>();
	     a1.add("Anmol");
	     a1.add("Duggu");
	     a1.add("VU");
	     
	     PrintWriter out = res.getWriter();
	     
	     HttpSession h1 = req.getSession();
	     h1.setAttribute("listofnames", a1);
	   
	     if(result == true)
	     {
	    	// res.sendRedirect("Bappa.html");
	    	 RequestDispatcher rd=req.getRequestDispatcher("credit-bappa");
	    	 rd.forward(req, res);
	     }
	     else
	     {
	    	 out.println("Invalid");
	     }
	     
	     
	}
}
