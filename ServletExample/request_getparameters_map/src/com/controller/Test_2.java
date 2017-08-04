package com.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test_2
 */
@SuppressWarnings("serial")
@WebServlet("/com.controller.Test_2")
public class Test_2 extends HttpServlet
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
        Map<String, String[]> map=request.getParameterMap();
        Set<String> keys=map.keySet();
        for(Object param_name : keys)
        {
        	out.print(param_name);
        	String param_values[]=map.get(param_name);
        	for(String v : param_values)
        	{
        		out.print(" : "+v);
        	}
        	out.print("<br>");
	    }
	}
}
