

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class S1
 */
@SuppressWarnings("serial")
@WebServlet("/S4")
public class S4 extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		 PrintWriter out=response.getWriter();
		   response.setContentType("text/html");
		   HttpSession session=request.getSession();
	       String id=(String) session.getAttribute("id");
	       String name=(String) session.getAttribute("name");
	       String email=(String) session.getAttribute("email");
	       String phone=(String) session.getAttribute("phone");
	       String city=request.getParameter("city");
	       String state=request.getParameter("state");
	       out.print("<h1> within S4 Servlet </h1><hr>");
	       out.print("<br> ID    : "+id);
	       out.print("<br> Name  : "+name);
	       out.print("<br> Email : "+email);
	       out.print("<br> Phone : "+phone);
	       out.print("<br> City  : "+city);
	       out.print("<br> State : "+state);	             
	}

}
