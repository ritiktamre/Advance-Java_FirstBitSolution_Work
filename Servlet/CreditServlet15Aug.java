package demo;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/credit15-Aug")
public class CreditServlet15Aug extends HttpServlet {
 
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		System.out.println("Second servlet Connected");
	    HttpSession session = req.getSession();
	    ArrayList<String> a1 = (ArrayList<String>)session.getAttribute("name");
	    res.sendRedirect("15Aug.jsp");
	}
}
