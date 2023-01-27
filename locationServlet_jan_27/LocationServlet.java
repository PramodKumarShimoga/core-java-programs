package com.xworkz.locationServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 2,urlPatterns = "/loc")
public class LocationServlet extends HttpServlet {
	public LocationServlet() {
		System.out.println(this.getClass().getSimpleName()+" created");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name =req.getParameter("name");
		String mail=req.getParameter("mail");
		String spoint =req.getParameter("spoint");
		String destination=req.getParameter("destination");
		String gen=req.getParameter("gen");
		if(name.length()>3&&spoint.length()>3&&destination.length()>3)
		{
			System.out.println("Valid String");
			System.out.println(name);
			System.out.println(mail);
			System.out.println(spoint);
			System.out.println(destination);
			System.out.println(gen);
		}
		
		else
		{
			System.out.println("Invalid String Format it must be Greaterthen 3");
		}
		
		
		PrintWriter p=resp.getWriter();
		if(name.length()>3&&spoint.length()>3&&destination.length()>3)
		{
			p.println("<h1 style=color:green>Login Succcess..........");
			p.println(name);
			p.println(mail);
			p.println(spoint);
			p.println(destination);
			p.println(gen);p.print("<h1>");
			p.println("<h1><a href='contactForm.html'>SEND AGAIN</a></h1>");
			p.println("<h1><a href='index.html'>HOME</a></h1>");
		}
		
		else
		{
			p.println("<h1 style=color:red>Invalid String Format it must be Greaterthen 3</h1>");
			p.println("<h1><a href='contactForm.html'>SEND AGAIN</a></h1>");
			p.println("<h1><a href='index.html'>HOME</a></h1>");
		}
		
		
		
	}
	
}
