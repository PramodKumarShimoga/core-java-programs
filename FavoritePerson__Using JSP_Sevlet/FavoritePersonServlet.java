package com.xworkz.favoritePerson.servlet;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(loadOnStartup = 1,urlPatterns = "/catch")
public class FavoritePersonServlet extends HttpServlet{
	
	public FavoritePersonServlet() {
		System.out.println("Favorite person created!!!");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost in FavoritePersonServlet.....");
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String gen=req.getParameter("gen");
		String reason=req.getParameter("reason");
		
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(gen);
		System.out.println(reason);
		
		RequestDispatcher dis=req.getRequestDispatcher("display.jsp");
		req.setAttribute("fname", fname);
		req.setAttribute("lname", lname);
		req.setAttribute("gen", gen);
		req.setAttribute("reason", reason);
		dis.forward(req, resp);
	}
}