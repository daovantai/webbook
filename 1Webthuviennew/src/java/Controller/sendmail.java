/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.PasswordAuthentication;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author VAN TAI
 */
@WebServlet(name = "sendmail", urlPatterns = {"/sendmail"})
public class sendmail extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd=request.getRequestDispatcher("/index.html");
        rd.forward(request, response);
        
    }


    @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
            Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
                props.put("mail.debug", "true");
                props.put("mail.transport.protocol", "smtp");
	     props.put("mail.smtp.ssl.protocols", "TLSv1.2");
		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			@Override
			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				return new javax.mail.PasswordAuthentication("daotai23092001@gmail.com", "ydwoetpjipijanek");
			}
		});
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String messages = request.getParameter("message");
           try {
			Message message = new MimeMessage(session);
//			message.setHeader("Content-Type", "text/plain; charset=UTF-8");
			message.setFrom(new InternetAddress("daotai23092001@gmail.com"));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
			message.setSubject(name);
			message.setText(messages);
			Transport.send(message);
		} catch (MessagingException e) {
			e.printStackTrace();
			
		}
		
           response.sendRedirect("index.html");
	}
        
    }
    
   

    

