package com.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CourseReg
 */
@SuppressWarnings("serial")
@WebServlet("/com.controller.CourseReg")
public class CourseReg extends HttpServlet
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out =response.getWriter();
		response.setContentType("text/html");
		int cid = Integer.parseInt(request.getParameter("cid"));
		String cname = request.getParameter("cname");
		double cfees = Double.parseDouble(request.getParameter("cfees"))	;
		ServletConfig config = this.getServletConfig();
		ServletContext context=this.getServletContext();
		try 
		{
			String driver = context.getInitParameter("driver");
			String url = context.getInitParameter("url");
			String username=config.getInitParameter("username");
			String password=config.getInitParameter("password");
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,username,password);
			String sql = "Insert into Course values (?,?,?)"; 
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, cid);
			pst.setString(2, cname);
			pst.setDouble(3, cfees);
			int status = pst.executeUpdate();
			if(status > 0 )
				out.print("<h1>Course registered successfully</h1> " );				
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}
}
