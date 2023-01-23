package com.xworkz.beach;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/Malpe")
public class MalpeServlet extends HttpServlet {
	public MalpeServlet() {
		System.out.println("Malpe beach Created>>>>>>>>>>>>>>>");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("MALPE Beach Arrived.............");
		
		
	}
	

}
