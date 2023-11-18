package com.walletService.paymentwalletservice.email;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.walletService.paymentwalletservice.controller.PaymentController;

import jakarta.mail.internet.MimeMessage;


@Service
public class EmailService {
	Logger logger = LoggerFactory.getLogger(EmailService.class);
	@Autowired
	private JavaMailSender javaMailSender;
	
	@Value("${spring.mail.username}")
	private String sender;

	public String sendEmail(String receipient,int body,String subject ) throws Exception {
		 MimeMessage mimeMessage = javaMailSender.createMimeMessage();
         MimeMessageHelper mimeMessageHelper;
         try {
         mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
         mimeMessageHelper.setFrom(sender);
         mimeMessageHelper.setTo(receipient);
         mimeMessageHelper.setText("Your Wallet Authentication OTP is : "+String.valueOf(body));
         mimeMessageHelper.setSubject(subject);
         // Sending the mail
         javaMailSender.send(mimeMessage);
         return "Mail sent Successfully";
		}
        catch(Exception e) {
        	 throw new Exception("Error while sending mail!!!");
        }
	}
}
