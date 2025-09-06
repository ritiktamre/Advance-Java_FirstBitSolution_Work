package demo;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/credit-practice1")
public class CreditServletPractice1 extends HttpServlet{

	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		System.out.println("Second Servlet Connected");
        HttpSession session = req.getSession();
        ArrayList<String> a1 = (ArrayList<String>)session.getAttribute("names");
        res.sendRedirect("Practice1.jsp");
	}
}
