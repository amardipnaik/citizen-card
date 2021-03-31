package com.project.service;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendEmail {
	
	@Autowired
	private JavaMailSenderImpl javaMailSender;


	
@RequestMapping(value = "sendMail", method = RequestMethod.GET)
  public void sendMailUAT() throws MessagingException
  {
   
  System.out.println("In Send Mail");
    Session session =null;
        
    MimeMessage mimeMessage =null;
        
    String senderMailId = "amardipsnaik@gmail.com";
  
    //String password =mailConfig.get("PASSWORD");
          
    String host ="smtp.gmail.com";

    String port = "465";
          
    String subject = "Test Subject";
    
   
    
    String body = "Test Body";
      
    Properties props = new Properties();
    props.put("mail.smtp.auth", "false");
    props.put("mail.smtp.ssl.enable", "false");
    props.put("mail.smtp.starttls.enable", "false");    
    props.put("mail.debug", "true");
    props.put("mail.transport.protocol", "smtp");
      
    props.setProperty("mail.pop3.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
    props.put("mail.pop3.host", "pop.gmail.com");
    props.put("mail.pop3.port", "995");
    props.put("mail.pop3.starttls.enable","true");
    props.setProperty("mail.pop3.socketFactory.fallback", "false");

    javaMailSender.setHost(host);
    javaMailSender.setPort(Integer.parseInt(port));
    javaMailSender.setJavaMailProperties(props);
          
    session = Session.getDefaultInstance(javaMailSender.getJavaMailProperties());
    
      
    mimeMessage = new MimeMessage(session);
        
  
    {
    
    
      mimeMessage.setFrom(new InternetAddress(senderMailId)); 
      
      mimeMessage.setRecipients(Message.RecipientType.TO,"amardipsnaik@gmail.com");
          
      mimeMessage.setSubject(subject);
     
      BodyPart messageBodyPart = new MimeBodyPart();

      messageBodyPart.setContent(body, "text/html; charset=utf-8");

    
      javaMailSender.send(mimeMessage);
            
          
    }
  }

  
	
}