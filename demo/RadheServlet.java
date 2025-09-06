package demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import org.apache.coyote.http11.upgrade.UpgradeProcessorInternal;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet ("/Radhe")
public class RadheServlet  extends HttpServlet{
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		 
		System.out.println("Servlet Connected");
		
		String name=req.getParameter("userName");
		String password=req.getParameter("password");
		
		System.out.println(name);
		System.out.println(password);
		
		VerificationRadhe v1 = new VerificationRadhe();
		boolean result = v1.isValid(name, password);
		
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Jiski Naiya");
		a1.add("Shyam Bharose");
		a1.add("Dhol bhale sakti");
		a1.add("Dubb nhi sakti h");
		
		
		PrintWriter out=res.getWriter();
		
		HttpSession s1 = req.getSession();
		s1.setAttribute("name", a1);
		
		if(result == true)
		{
		   RequestDispatcher rd = req.getRequestDispatcher("radhecredit");
		   rd.forward(req, res);
		}
		else
		{
			out.println("Invalid");
		}
	}
   
}
