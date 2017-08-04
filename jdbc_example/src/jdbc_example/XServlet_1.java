package jdbc_example;
import javax.servlet.*;
import java.io.*;
public class XServlet_1 implements Servlet
{
  public void init(ServletConfig config)
    throws ServletException
    {

    }

  public ServletConfig getServletConfig()
  {
  	return null;
  }

  public void service(ServletRequest req, ServletResponse res)
    throws ServletException, IOException
    {
    	System.out.println ("User-request");
    	PrintWriter out = res.getWriter();
    	res.setContentType("text/html");
    	out.println ("<h1>First Servlet application </h1>");
    }

  public String getServletInfo()
  {
  	return null;
  }

  public void destroy()
  {

  }
}
