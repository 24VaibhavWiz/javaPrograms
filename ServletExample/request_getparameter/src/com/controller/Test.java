package com.controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class Test
 */
@SuppressWarnings("serial")
@WebServlet("/com.controller.Test")
public class Test extends HttpServlet
{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		int roll= Integer.parseInt(request.getParameter("roll"));
		String name=request.getParameter("name");
		int age=Integer.parseInt(request.getParameter("age"));
		double cgpa=Double.parseDouble(request.getParameter("cgpa"));
		out.print("<br>Roll :" +roll);
		out.print("<br>Name : "+name);
		out.print("<br>Age  : "+age);
		out.print("<br>CGPA : "+cgpa);
	}

}
