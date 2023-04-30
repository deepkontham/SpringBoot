package com.example.demo.mail;

import java.util.Date;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MailServiceScheduler {
	
	Logger logger=LoggerFactory.getLogger(MailServiceScheduler.class);
	@Autowired
	JavaMailSender javaMailSender;

	@Value("/${spring.mail.username}")
	private String sender;
	
	String receiver = "pradeepkontham99@gmail.com";

	@Scheduled (fixedRate = 2000L)
//	@Scheduled(cron = "*/2******")
	public String senderMail() {
		try {
			SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
			simpleMailMessage.setFrom(sender);
			simpleMailMessage.setTo(receiver);
			simpleMailMessage.setText("Hi I am  Send Msg For You");
			simpleMailMessage.setSubject("My Name is Pradeep");
			
			
			javaMailSender.send(simpleMailMessage);
//			System.out.println("Mail Scheduled");
			logger.info("Mail Scheduled"+new Date());
			Thread.sleep(1000L);
			return "Mail Sent Successfully";
		} catch (Exception e) {
			// TODO: handle exception
			return "Mail Not Sent Successfully";
		}
	}

}
