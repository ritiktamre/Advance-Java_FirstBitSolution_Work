package demo;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/credit-tamre")
public class TamreCreditServlet extends HttpServlet{

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		System.out.println("Second Servlet Connected");
		HttpSession h1 = req.getSession();
		List<String> l1 = (List<String>)h1.getAttribute("name");
		res.sendRedirect("Tamre.jsp");
	}
}
