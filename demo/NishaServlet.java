package demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/nisha")
public class NishaServlet extends HttpServlet {
 
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		System.out.println("Server Connected");
		String name=req.getParameter("username");
		String password=req.getParameter("password");
		
		System.out.println(name);
		System.out.println(password);
		
		NishaVerification n1 = new NishaVerification();
        boolean result=n1.isValid(name, password);
        
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("Ritik-Tamre Family");
        a1.add("Ritik-Shyam Parivar");
        a1.add("Ritik-Tamre & Sahu Family");
        
        
        PrintWriter p1 = res.getWriter();
        HttpSession s1 = req.getSession();
        s1.setAttribute("name", a1);
        
        
        if(result == true)
        {
        	RequestDispatcher rd = req.getRequestDispatcher("nisha-credit");
        	rd.forward(req, res);
        	
        	p1.println("<h1>Radhe Radhe Valid</h1>");
        }
        else
        {
        	p1.println("Invalid");
        }
	}
}
