package com.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test_3
 */
@SuppressWarnings("serial")
@WebServlet("/com.controller.Test_3")
public class Test_3 extends HttpServlet
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
        Enumeration<String> e=request.getParameterNames();
        while(e.hasMoreElements())
        {
        	String param_name=e.nextElement();
        	String[] param_values=request.getParameterValues(param_name);
        	out.print(param_name+" ");
        	for(String values : param_values)
        		out.print(values);
        	    out.print("<br>");	
	    }
	}
}
