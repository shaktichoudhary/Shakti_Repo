package sona.shak;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import com.google.appengine.api.mail.MailService;
import com.google.appengine.api.mail.MailServiceFactory;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

public class SendMail {
			
	public static void sendEmail(String content, String name){

		String subject = "Happy Birthday Cherryyy";
		String sender 		= "shakti.choudhary@a-cti.com";
		String recepient	= "chevvanthi.ezhilarasu@a-cti.com";
		System.out.println("shakti the content m getting is "+content);
		StringBuffer sb = new StringBuffer("");
		sb.append("Hi Chevu ,");
		sb.append("\n>");
		sb.append("\n>");
		sb.append(content);
		sb.append("\n>");
		sb.append("Regards \n>");
		sb.append(name);
		System.out.println("shakti the msg content is "+sb.toString());
		MailService mailService = MailServiceFactory.getMailService();
		MailService.Message message = new MailService.Message();
		message.setSender(sender);
		message.setTo(recepient);
		message.setSubject(subject);
		message.setTextBody(sb.toString());
		
		try{
			mailService.send(message);
		}catch(Exception e){
			StringWriter sw1 = new StringWriter();
			PrintWriter pw1 = new PrintWriter(sw1);
			e.printStackTrace(pw1);
			System.out.println(sw1.toString());
		}
		/*String recepient	= "shakti.choudhary@a-cti.com";
		String from = "shakti.choudhary@a-cti.com";
		String subject = "Happy Birthday Cherryyy";
		try{
		Properties properties = new Properties();
		Session session = Session.getDefaultInstance(properties, null);
		
		Multipart mp = new MimeMultipart();

        MimeBodyPart htmlPart = new MimeBodyPart();
        htmlPart.setContent(content, "text/plain");
        mp.addBodyPart(htmlPart);
		
		Message eMessage = new MimeMessage(session);
		eMessage.setFrom(new InternetAddress(from));
		eMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
		
		eMessage.setSubject(subject);
		eMessage.setContent(mp);
		eMessage.setText(content);
		Transport.send(eMessage);
		}catch(Exception e){
			System.out.println("exception occured in sending mail "+e);
			e.printStackTrace();
		}*/
		
	}
}
