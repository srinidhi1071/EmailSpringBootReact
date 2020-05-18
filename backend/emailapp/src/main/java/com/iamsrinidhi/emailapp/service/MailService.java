package com.iamsrinidhi.emailapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/*

  @Author:Srinidhi R.V
  
  
  
*/
@Service
public class MailService {

	private JavaMailSender javaMailSender;
	
	@Autowired
	public MailService(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}
	
	public void sendMail(String email,String subject,String textBody) {
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo(email); 
		mail.setSubject(subject);
		mail.setText(textBody);
		
		
		javaMailSender.send(mail);
		
	}
}
