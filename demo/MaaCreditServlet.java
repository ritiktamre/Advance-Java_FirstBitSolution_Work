package demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/maacredit")
public class MaaCreditServlet extends HttpServlet{

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
	   System.out.println("Servlet Connected 2");	
	   HttpSession  session = req.getSession();
	   System.out.println(session.getId());
	   List<String> l1 = (ArrayList<String>)session.getAttribute("listofname");
	   res.sendRedirect("Maa.jsp");
	}
}
