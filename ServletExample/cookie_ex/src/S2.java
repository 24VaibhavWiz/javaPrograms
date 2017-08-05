

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
@WebServlet("/S2")
public class S2 extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
       PrintWriter out=response.getWriter();
       response.setContentType("text/html");
       Cookie c[]=request.getCookies();
       out.print("within s2 servlet");
       for(int i=0;i<c.length;i++)
       {
    	   out.print(" "+c[i].getName()+"........"+c[i].getValue());
       }
       out.print("<a href='S2'>Click Here For S3</a>");
	}
}
