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

@WebServlet("/15-Aug")
public class LoginServlet15Aug extends HttpServlet{

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		System.out.println("Servlet Connected");
		
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		
		System.out.println(name);
		System.out.println(password);
		
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Radhe Radhe");
		a1.add("Radhe Krishna");
		a1.add("Mere Shyam");
		
	   Verification15Aug v1 = new Verification15Aug();
	   boolean result=v1.isValid(name, password);
	   	   
	  PrintWriter out = res.getWriter();
	  HttpSession s1 = req.getSession();
	  s1.setAttribute("name", a1);
	  
	  if(result == true)
	  {
		  RequestDispatcher rd = req.getRequestDispatcher("credit15-Aug");
		  rd.forward(req, res);
		  out.println("<h1>Bharat Mata Ki jai</h1>");
	  }
	  else
	  {
		  out.println("Invalid");
	  }
	}
}
