

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class S1
 */
@SuppressWarnings("serial")
@WebServlet("/S2")
public class S2 extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	  PrintWriter out=response.getWriter();
	  response.setContentType("text/html");
	  String id=request.getParameter("id");
	  String name=request.getParameter("name");
	  String age=request.getParameter("age");
	  out.print("ID :"+id);
	  out.print("<br>Name : "+name);
	  out.print("<br>age : "+age);
	}
}

