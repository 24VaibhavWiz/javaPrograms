

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
       PrintWriter out=response.getWriter();
       response.setContentType("text/html");
       String id=request.getParameter("id");
       String name=request.getParameter("name");
       out.print("within s1 servlet");
       out.print("ID"+id);
       out.print("Name"+name);
       Cookie c1=new Cookie("id",id);
       Cookie c2=new Cookie("name",name);
       response.addCookie(c1);
       response.addCookie(c2);
       out.print("<a href='S2'>Click Here For S2</a>");
	}
}
