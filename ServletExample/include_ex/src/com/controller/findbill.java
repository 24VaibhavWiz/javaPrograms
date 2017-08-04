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
@WebServlet("/com.controller.findbill")
public class findbill extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.print("<br><br><br><br><br>");
		int curr_unit=Integer.parseInt(request.getParameter("cbill"));
		int prev_unit=Integer.parseInt(request.getParameter("pbill"));
		int tot_unit=curr_unit-prev_unit;
		double unit_price=(double)request.getAttribute("unit_price");
		double tot_bill=tot_unit*unit_price;
		out.print("total bill amount is ");
		out.print(tot_bill);
		out.print("<br><br><br><br><br>");
	}
}
