package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.EventListener;

import com.example.demo.mail.MailServerService;

import jakarta.mail.MessagingException;

@SpringBootApplication
public class SpringBootMailSenderApplication {
	


	public static void main(String[] args) throws MessagingException {
		MailServerService bean = SpringApplication.run(SpringBootMailSenderApplication.class, args).getBean(MailServerService.class);
  bean.SendMailwithatttachment("marripellyranjithkumar@gmail.com", "hi", "hello laxman", "C:\\Users\\Dell\\Desktop\\PaintedPicture.jpg");
	
	
	}
	
	
	   
	}


