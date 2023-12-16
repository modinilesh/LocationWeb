package com.springboot.udemy.Locationweb.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Component	//it will help in automatically generate the component at runtime
public class EmailUtilImpl implements EmailUtil {

	@Autowired
	private JavaMailSender sender;
	
	@Override
	public void sendEmail(String toAddress, String subject, String body) {
		
		//creating the helper
		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);
		
		//setting and sending mail
		try {
			helper.setTo(toAddress);
			helper.setSubject(subject);
			helper.setText(body);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		
		sender.send(message);
		
		
	}

}
