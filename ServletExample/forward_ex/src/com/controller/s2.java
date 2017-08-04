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
@WebServlet("/com.controller.s2")
public class s2 extends HttpServlet
{  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	   PrintWriter out=response.getWriter();
	   response.setContentType("text/html");
	   out.print("resopse-s2");
	   String username=request.getParameter("usernsme");
	   String password=request.getParameter("password");
	   if(username.equals(password))
		   out.print("login sucess");
	   else
		   out.print("fails");
	}

}
