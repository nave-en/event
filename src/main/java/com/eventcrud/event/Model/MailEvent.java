package com.eventcrud.event.Model;

import java.time.LocalDateTime;
import java.util.Properties;

import jakarta.mail.*;
import jakarta.mail.internet.*;

public class MailEvent {
	public String eventName;
	public String[] participants;
	LocalDateTime datetime;
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String[] getParticipants() {
		return participants;
	}
	public void setParticipants(String[] participants) {
		this.participants = participants;
	}
	public LocalDateTime getDatetime() {
		return datetime;
	}
	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}
	public void addEvent() {
		
	}
//	public void sendMail() {
//		final String sendMail = "";
//		final String password = "";
//		String recipientList = String.join(",", this.participants);
//		Properties props = new Properties();
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.starttls.enable", "true");
//        props.put("mail.smtp.host", "smtp.gmail.com");
//        props.put("mail.smtp.port", "587");
//        Session session = Session.getInstance(props, new Authenticator() {
//            protected PasswordAuthentication getPasswordAuthentication() {
//                return new PasswordAuthentication(sendMail, password);
//            }
//        });
//        
//        try {
//            // Create message
//            Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress(sendMail));
//            
//            // Set multiple recipients
//            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientList));
//
//            message.setSubject("Test Email to Multiple Recipients");
//            message.setText("Hello, this email is sent to multiple recipients!");
//
//            // Send email
//            Transport.send(message);
//
//            System.out.println("Email sent successfully to multiple recipients!");
//        } catch (MessagingException e) {
//            e.printStackTrace();
//        }
//	}
}
