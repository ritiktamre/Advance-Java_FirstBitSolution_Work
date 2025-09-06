package demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/credit")
public class CreditServlet extends HttpServlet {

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		HttpSession session=req.getSession(false);
		System.out.println(session.getId());
		List<String> friendnames=(List<String>) session.getAttribute("listofname");
		res.sendRedirect("Home.jsp");
		//System.out.println(friendnames);
	}
}
