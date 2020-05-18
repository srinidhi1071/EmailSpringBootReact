package com.iamsrinidhi.emailapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.iamsrinidhi.emailapp.model.Email;
import com.iamsrinidhi.emailapp.service.MailService;

@RestController
@CrossOrigin(origins = {"*","http://localhost:3000"})
public class EmailController {
	
	@Autowired
	private MailService notificationService;
	
	@PostMapping("/send-mail")
	public String send(@RequestBody Email email) {
		
		
		
		try {
			notificationService.sendMail(email.getEmailAddress(),email.getSubject(),email.getBodyText());
		}
		catch(MailException e) {
			e.printStackTrace();
		}
		
		return "Congratulations! Your mail has been send to the user.";
		
	}
	
	@GetMapping("/test")
	public String test() {
		return "test API";
	}

}
