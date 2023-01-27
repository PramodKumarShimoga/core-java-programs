package com.xworkz.locationServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/con")
public class ContactServlet extends HttpServlet {
public ContactServlet() {
	System.out.println(this.getClass().getSimpleName()+"created");
}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name =req.getParameter("name");
	String mail=req.getParameter("mail");
	String mobile =req.getParameter("mobile");
	String comments=req.getParameter("comments");
	
	if(name.length()>3&&comments.length()>3)
	{
		System.out.println("Valid String");
		System.out.println(name);
		System.out.println(mail);
		if(mobile.length()>2)
		{
			System.out.println(mobile);	
		}
		else
		{
			System.out.println("inavlid mobile number format");
		}
		
		System.out.println(comments);
	}
	
	else
	{
		System.out.println("Invalid String Format it must be Greaterthen 3");
	}
	
	
	PrintWriter p=resp.getWriter();
	if(name.length()>3&&comments.length()>3&&mobile.length()>2)
	{
		p.println("<h1 style=color:green>Login Succcess..........");
		p.println(name);
		p.println(mail);
		
		p.println(comments);
		
		p.println(mobile);
				
		
		p.print("</h1>");
	}
	
	else
	{
		p.println("<h1 style=color:red>Invalid String Format it must be Greaterthen 3</h1>");
		p.println("<h1><a href='contactForm.html'>SEND AGAIN</a></h1>");
		p.println("<h1><a href='index.html'>HOME</a></h1>");
	}
	
	
	

	}
	

}
