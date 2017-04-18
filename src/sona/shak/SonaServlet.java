package sona.shak;
import java.io.IOException;
import java.io.PrintWriter;

//import javax.jdo.PersistenceManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

//import com.google.appengine.api.datastore.Key;
//import com.google.appengine.api.datastore.KeyFactory;

@SuppressWarnings("serial")
public class SonaServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException {
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
	//	User user=new User();
	//	Key key;
		RequestDispatcher rd=null;
		rd=req.getRequestDispatcher("/Header.jsp");
		rd.include(req, res);
		if(req.getParameter("submit").equals("Sign Up"))
		{
			
			//System.out.println(req.getParameter("submit"));
			String username=req.getParameter("uname");
			//String userpass=req.getParameter("pass");
			/*user.setUname(username);
			user.setPass(userpass);
			key=KeyFactory.createKey(User.class.getSimpleName(),username);
			user.setKey(key);
			PersistenceManager pm=PMF.get().getPersistenceManager();
			try
			{
			pm.makePersistent(user);
			}
			finally
			{
				pm.close();
			}*/
			if(req.getHeader("user-agent").indexOf("Chrome")!=-1)
			     pw.println("<center>you are using Chrome Browser");
			 else if(req.getHeader("user-agent").indexOf("Firefox")!=-1)
			     pw.println("<font color=red><center> you are using mozilla firefox Browser");

			 else if(req.getHeader("user-agent").indexOf("MSIE")==-1)
			     pw.println("<center>you are using Internet Explorer Browser");
			  pw.println("<hr> <iframe align='center' src='Slider/index.html' frameborder='0' marginheight='0' marginwidth='0' width='700' height='360' style='margin: 0px; padding: 0px;'></iframe><hr>");	
			  pw.println("<center>Development is under progress..... Sorry for inconvinience..."+username+"<br> This site is developed in hurry for my mind sucking CHUHIYA...</center>");
		}
		if(req.getParameter("submit").equals("Log In"))
		{
			String username=req.getParameter("uname");
			pw.println("<div align='left'>Your IP Address=> "+req.getRemoteAddr());
			pw.println("<hr> <iframe align='center' src='Slider/index.html' frameborder='0' marginheight='0' marginwidth='0' width='700' height='360' style='margin: 0px; padding: 0px;'></iframe><hr>");
			pw.println("<center>Development is under progress..... Sorry for inconvinience..."+username+"<br> This site is developed in hurry for my mind sucking CHUHIYA...</center>");
	       //rd=req.getRequestDispatcher("/Header.jsp"); 
	       // rd.include(req,res);	
		}
		req.getRequestDispatcher("/Footer.jsp").include(req, res);
	}
}
