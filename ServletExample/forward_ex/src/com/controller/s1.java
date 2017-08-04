package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class s1
 */
@WebServlet("/com.controller.s1")
public class s1 extends HttpServlet
{  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	   PrintWriter out=response.getWriter();
	   response.setContentType("text/html");
	   out.print("response-1");
	   RequestDispatcher rd=request.getRequestDispatcher("com.controller.s2");
	   rd.forward(request, response);
	   out.print("response-s1 servlet");
	}

}
