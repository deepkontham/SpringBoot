package com.example.demo.mail;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
@Service
public class MailServerService {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	public void sendEmailsender(String toEmail,String body,String subject ) {
		SimpleMailMessage message=new SimpleMailMessage();
		message.setFrom("pradeepkontham55@gmail.com");
		message.setTo(toEmail);
		message.setText(body);
		message.setSubject(subject);
		
		javaMailSender.send(message);
		System.out.println("mail send");
	}
		public void SendMailwithatttachment(String toEmail,String body,String subject,String attacchment ) throws MessagingException {
			MimeMessage message=javaMailSender.createMimeMessage();
			MimeMessageHelper mimeMessageHelper=new MimeMessageHelper(message, true);
			mimeMessageHelper.setFrom("pradeepkontham55@gmail.com");
			mimeMessageHelper.setTo(toEmail);
			mimeMessageHelper.setText(body);
			mimeMessageHelper.setSubject(subject);
			
			FileSystemResource fileSystemResource=new FileSystemResource(new File(attacchment));
			mimeMessageHelper.addAttachment(fileSystemResource.getFilename(), fileSystemResource);
			javaMailSender.send(message);
			System.out.println("mail send");


			
		}
		
	}


