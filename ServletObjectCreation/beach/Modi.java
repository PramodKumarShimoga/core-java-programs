package com.xworkz.beach;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 2,urlPatterns = "/modi")
public class Modi extends HttpServlet {
	public Modi() {
		System.out.println("Modi created...........");
	}
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("modi called>>>>>>>>>>>");
}
}
