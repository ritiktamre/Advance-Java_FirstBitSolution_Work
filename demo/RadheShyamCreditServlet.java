package demo;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/RadheShyamcredit")
public class RadheShyamCreditServlet extends HttpServlet {

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		System.out.println("Second servlet Connected");
		HttpSession session =req.getSession();
		List<String> l1 = (List<String>)session.getAttribute("names");
		res.sendRedirect("RadheShyam.jsp");
	}
}
