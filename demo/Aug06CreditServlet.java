package demo;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Aug06-credit")
public class Aug06CreditServlet extends HttpServlet {
 
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		System.out.println("Second Servlet Connected");
		HttpSession ses = req.getSession();
		List<String> l1 = (List<String>)ses.getAttribute("name");
		res.sendRedirect("Aug06.jsp");
	}
}
