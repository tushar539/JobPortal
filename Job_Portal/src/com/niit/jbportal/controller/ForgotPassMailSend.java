package com.niit.jbportal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
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

import com.niit.jbportal.model.Employee;

@WebServlet("/ForgotPassMailSend")
public class ForgotPassMailSend extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();	
		
		Employee employee=(Employee)request.getAttribute("employee");
		
		String sendingTo=employee.getEmail();

			//Get properties object    
		        Properties props = new Properties();    
		        props.put("mail.smtp.host", "smtp.gmail.com");    
		        props.put("mail.smtp.socketFactory.port", "465");    
		        props.put("mail.smtp.socketFactory.class",    
		                  "javax.net.ssl.SSLSocketFactory");    
		        props.put("mail.smtp.auth", "true");    
		        props.put("mail.smtp.port", "465");    

		        //get Session   
		        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {    
		         protected PasswordAuthentication getPasswordAuthentication() {    
		         return new PasswordAuthentication("jobshuntcom@gmail.com","yoyo@1234");  
		         }    
		        });    
		        //compose message    
		        try {    
		         MimeMessage message1 = new MimeMessage(session);    
		         message1.addRecipient(Message.RecipientType.TO,new InternetAddress(sendingTo));    
		         message1.setSubject("Recovered Password");    
		         message1.setText("Your recovered Password for account: "+employee.getEmail()+ " is: " +employee.getPassword()); 
		         Transport.send(message1);
		         
		         //send message 
		         if(message1!=null) {
		         RequestDispatcher rd=request.getRequestDispatcher("ForgotPass.jsp");
		         request.setAttribute("msg", "Password sent to your mail Successfully, Check your mail Id");
		         rd.forward(request,response);
		         }
		        } catch (MessagingException e)
		        {
		        	throw new RuntimeException(e);
		        }    	
		
	}

}
