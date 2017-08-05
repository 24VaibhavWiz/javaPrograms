
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class Final
 */
@SuppressWarnings("serial")
@WebServlet("/Final")
public class Final extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	   PrintWriter out=response.getWriter();
	   response.setContentType("text/html");
	   int status=Integer.parseInt(request.getParameter("status"));
	   HttpSession session=request.getSession();
	   if(status==1)
	   {
		   session.setAttribute("id",request.getParameter("id"));
		   session.setAttribute("name",request.getParameter("name"));
		   response.sendRedirect("contact.html");
	   }
	   if(status==2)
	   {
		   session.setAttribute("email",request.getParameter("email"));
		   session.setAttribute("phone",request.getParameter("phone"));
		   response.sendRedirect("address.html");
	   }
	   if(status==3)
	   {
	       String id=(String) session.getAttribute("id");
	       String name=(String) session.getAttribute("name");
	       String email=(String) session.getAttribute("email");
	       String phone=(String) session.getAttribute("phone");
	       String city=request.getParameter("city");
	       String state=request.getParameter("state");
	       out.print("<br> ID    : "+id);
	       out.print("<br> Name  : "+name);
	       out.print("<br> Email : "+email);
	       out.print("<br> Phone : "+phone);
	       out.print("<br> City  : "+city);
	       out.print("<br> State : "+state);
	       out.print("<br><br><a href='S1'>Click for S1</a>");
      }
	}
}