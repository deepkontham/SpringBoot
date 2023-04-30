package com.example.demo;

import javax.mail.MessagingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;




@SpringBootApplication
@EnableScheduling
public class SpringBootMailSenderApplication {
	
	public static void main(String[] args) {
	SpringApplication.run(SpringBootMailSenderApplication.class, args);

	}
	
	
	   
	}


