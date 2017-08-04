

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
@WebServlet("/S1")
public class S1 extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	  PrintWriter out=response.getWriter();
	  response.setContentType("text/html");
	  String id=request.getParameter("id");
	  String name=request.getParameter("name");
	  out.print("<br>Name : "+name);
	  out.print("<form action ='S2'>");
	  out.print("<input type='hidden' name='id' value="+id+">");
	  out.print("<input type='hidden' name='id' value="+name+">");
	  out.print("AGE <input type='text' name='age'>");
	  out.print("<br><input type='submit' value='Go'>");
	  out.print("</form>");
	}
}

