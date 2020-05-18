package com.iamsrinidhi.emailapp.model;

import org.springframework.stereotype.Component;

@Component
public class Email {
	
	private String subject;
	private String bodyText;
	private String emailAddress;
	
	
	
	public Email() {
		
	}
	public Email(String emailAddress,String subject, String bodyText) {
		super();
		this.subject = subject;
		this.bodyText = bodyText;
		this.emailAddress = emailAddress;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBodyText() {
		return bodyText;
	}
	public void setBodyText(String bodyText) {
		this.bodyText = bodyText;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	

}
