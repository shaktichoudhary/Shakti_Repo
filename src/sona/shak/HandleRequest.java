package sona.shak;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HandleRequest extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException{
		
		resp.setContentType("text/html");
		String mail = req.getParameter("umail");
		String content = req.getParameter("greetMsg");
		System.out.println("shakti the maild is "+mail+" and the content received is "+content);
		if(mail == null  || content == null){
			return;
		}
		try{
			SendMail.sendEmail(content, mail);
		}catch(Exception e){
			System.out.println("error occured in sending mail");
		}
		resp.sendRedirect("/Contact.jsp");
	}

}
