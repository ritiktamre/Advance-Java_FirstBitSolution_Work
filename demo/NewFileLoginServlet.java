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

@WebServlet("/newFile")
public class NewFileLoginServlet extends HttpServlet {
   
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		
		System.out.println("Servlet Connected");
		
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		
		System.out.println(name);
		System.out.println(password);
		
		NewFileVerification v1 = new NewFileVerification();
		boolean result = v1.isValid(name, password);
		
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Radhe Radhe");
		a1.add("Jai Shri Shyam");
		a1.add("Jai Mai Ki");
		
		PrintWriter out = res.getWriter();
		
		HttpSession s1 = req.getSession();
		s1.setAttribute("name", a1);
		
		if(result == true)
		{
			RequestDispatcher rd = req.getRequestDispatcher("newFileCredit");
			rd.forward(req, res);
			out.println("<h1>Radhe Radhe</h1>");
		}
		else
		{
			out.println("Invalid");
		}
	}
}
