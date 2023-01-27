package com.xworkz.webseries;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/webseries")
public class WebseriesServlet extends HttpServlet {
	public WebseriesServlet() {
		System.out.println(this.getClass().getSimpleName()+"is created");
	}	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("webSeriesNAme");
		String language=req.getParameter("language");
		String noOfEpisode=req.getParameter("noOfEpisode");
		String ott=req.getParameter("ott");
		String budget=req.getParameter("budget");		
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");		
		out.println("<span style=color:red><h1>"+name+"</h1></span>");
		out.println("<span style=color:red><h1>"+language+"</h1></span>");
		out.println("<span style=color:red><h1>"+noOfEpisode+"</h1></span>");
		out.println("<span style=color:red><h1>"+ott+"</h1></span>");
		out.println("<span style=color:red><h1>"+budget+"</h1></span>");
	
	}
}
