package com.project.service;

import java.util.Properties;
import java.util.Random;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;

public class MailSenderCode {

	public static void main(String[] args) {
		mailSender(46552,"amardipsnaik@gmail.com","Amardip");
		/*int randomNumber=getRandomIntegerBetweenRange();
				System.out.println(randomNumber);*/

	}
	
	public static int getRandomIntegerBetweenRange(){
		Random rand = new Random(); 
		int value = rand.nextInt(1000000);
		return value;
	}
	
	
	private static void  mailSender(int RandomPassword,String em,String fname) {                                         
		  //It works as a process bar            
		  
		  System.out.println("In Mail Sender");
		  String host="smtp.gmail.com";   
		  final String user = "citizencardonline@gmail.com";  
		  final String password = "go4it*123";
		  


		   if(!user.equals("") && !password.equals(""))
		   {
		     String SMTP_PORT = "465";
		     String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";    
		    
		    
		  
		     //Get the session object  
		     Properties props = new Properties();
		     props.put("mail.smtp.starttls.enable", "true");
		     props.put("mail.smtp.host",host);  
		     props.put("mail.smtp.auth", "true");  
		     props.put("mail.debug", "true");
		     props.put("mail.smtp.port", SMTP_PORT);
		     props.put("mail.smtp.socketFactory.port", SMTP_PORT);
		     props.put("mail.smtp.socketFactory.class", SSL_FACTORY);
		     props.put("mail.smtp.socketFactory.fallback", "false");  
		   
		     Session session = Session.getDefaultInstance(props,  
		     new javax.mail.Authenticator() {
		        
		       protected PasswordAuthentication getPasswordAuthentication() {  
		       return new PasswordAuthentication(user,password);  
		       }  
		     });    
		   
		 
		     try 
		     {  
		        MimeMessage message = new MimeMessage(session);  
		        
		        // creates message part
		        MimeBodyPart messageBodyPart = new MimeBodyPart();
		        messageBodyPart.setContent(message, "text/html");     
		     
		        message.setFrom(new InternetAddress(user));  
		        message.addRecipient(Message.RecipientType.TO,new InternetAddress(em));        
		        
		        message.setSubject("Citizen Card Two Way Authentication");
		       
		        StringBuilder builder=new StringBuilder();
		        builder.append("Hi "+fname);
		      
		        builder.append(",Welcome to citizen card two way authenticaton process");
		        builder.append(",Your autogenarted password is "+RandomPassword);
		        builder.append(",You can change your password from edit profile. ");
		        
		       /* builder.append("  *********This is a autogenarated mail Please do not reply ************* ");*/
		        
		        System.out.println("Body is "+builder);
		        message.setText(builder.toString());  
		        //send the message  
		        Transport.send(message);    
		     
		     System.out.println("Message Send Successfully.....");
		       
		      } 
		      catch (MessagingException e) {e.printStackTrace();}  
		      }
		  
		   else 
		   {
		      
		   }  
		}

}
