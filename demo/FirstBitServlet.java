package demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/FirstBit")
public class FirstBitServlet extends HttpServlet {

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		System.out.println("Servlet Connected");
		String name=req.getParameter("name");
		String password = req.getParameter("password");
		
		System.out.println("name");
		System.out.println("password");
		
		FirstBitVerification f1 = new FirstBitVerification();
		boolean result = f1.isValid(name, password);
		
		PrintWriter p1 = res.getWriter();
		
		if(result == true)
		{
		
		}
		
	}
}
