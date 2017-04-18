package sona.shak;
import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;
import java.util.*;
@SuppressWarnings("serial")
public class VoterSrv extends HttpServlet
{

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
   
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException

{
	int age=0;
	response.setContentType("text/html");
	PrintWriter pw=response.getWriter();
        pw.println("<div align='left'>Your IP Address=> "+request.getRemoteAddr());
	Calendar cl=Calendar.getInstance();
	int h=cl.get(Calendar.HOUR_OF_DAY);
	String name=request.getParameter("pname");
	String tage=request.getParameter("page");
      RequestDispatcher rd=request.getRequestDispatcher("/Header.jsp"); 
        rd.include(request,response);
        	
	if((name==null)||(name.equals("")))
	{
		pw.println("<font color='red'>name is required</font>");
		return;
	}
	 if((tage==null)||(tage.equals("")))
	{
		pw.println("<font color='red'>age is required</font>");
		return;
	}
	else
	{
		try
		{
		age=Integer.parseInt(tage);	
		}
		catch (NumberFormatException nfe)
		{
			pw.println("<font color='red'>age must be numeric</font>");
			return;
		}
	}
	if((age>0)&&(age<=120))
	{
	pw.println("<center>");
	if(h<=12)
			pw.println("<h1><font color='blue'>Good Morning</font></h1>");
		else if(h<=16)
			pw.println("<h1><font color='blue'>Good AfterNoon</font></h1>");
		else if(h<=20)
			pw.println("<h1><font color='blue'>Good Evening</font></h1>");
		else
			pw.println("<h1><font color='blue'>Good night</font></h1>");
pw.println("</center>");

	if(age>=18)
		pw.println("<font color=green><center><b><i></t>"+name+" you are eligible to vote</i></center></font>");
	else
		pw.println("<font color='red'><b><i><center></t>"+name+" you can not vote</i></font></center>");
	}
	else
	{
		pw.println("<font color='red'><b>age must be in the range(1-120)</font>");
		return;
	}
	pw.println("<br><br><center><a href='index.jsp'><img src='abc.jpg' height=40 width=60></a>");
        rd=request.getRequestDispatcher("/Footer.jsp"); 
        rd.include(request,response);
	pw.close();
}

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
        
public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
	doPost(request,response);
	
}
}
