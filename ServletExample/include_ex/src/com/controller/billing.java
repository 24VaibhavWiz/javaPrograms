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
 * Servlet implementation class billing
 */
@SuppressWarnings("serial")
@WebServlet("/com.controller.billing")
public class billing extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.print("following is the bill details.....");
		request.setAttribute("unit_price",9.90);
		RequestDispatcher rd=request.getRequestDispatcher("com.controller.findbill");
		rd.include(request, response);
		out.print("please pay bill as soon as possible.....");
	}
}
