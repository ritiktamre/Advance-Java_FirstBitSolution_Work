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

@WebServlet("/tamre")
public class TamreServlet extends HttpServlet{
  
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		System.out.println("Servelet Connected");
		
		String name = req.getParameter("username");
		String password=req.getParameter("password");
		
		System.out.println(name);
		System.out.println(password);
		
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Ritik-Sushma");
		a1.add("Ritik-Sunil");
		a1.add("Ritik-TamreFamily");
		
		VerificationTamre v1 = new VerificationTamre();
		boolean result=v1.isValid(name, password);
		
		PrintWriter p1=res.getWriter();
		HttpSession h1 = req.getSession();
		h1.setAttribute("name", a1);
		
		if(result==true)
		{
			RequestDispatcher rd = req.getRequestDispatcher("credit-tamre");
			rd.forward(req, res);
			p1.println("<h1>Radhe Radhe Best Of Luck</h1>");
		}
		else
		{
			System.out.println("Invalid");
		}
	}
}
