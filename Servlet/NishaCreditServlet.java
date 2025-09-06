package demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/nisha-credit")
public class NishaCreditServlet extends HttpServlet{

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		System.out.println("Second Servlet Connected");
		HttpSession h1 = req.getSession();
		ArrayList<String> l1=(ArrayList<String>)h1.getAttribute("name");
		res.sendRedirect("Nisha.jsp");
				
		}
}
