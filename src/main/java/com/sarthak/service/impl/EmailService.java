package com.sarthak.service.impl;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSendException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender javaMailSender;


    public void sendVerificationOtpEmail(String userEmail, String otp) throws MessagingException, MailSendException, UnsupportedEncodingException {
//        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
//        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, "utf-8");
//
//
//        String subject = "Account verification";
//        String text = "your account verification code is : " + otp;
//
//        helper.setSubject(subject);
//        helper.setText(text, true);
//        helper.setTo(userEmail);
//
//        try {
//            javaMailSender.send(mimeMessage);
//        } catch (MailException e) {
//            throw new MailSendException("Failed to send email");
//        }

        String senderName = "Security Gateway";
        String from = "rsarthak49@gmail.com";

        MimeMessage message = javaMailSender.createMimeMessage();

        MimeMessageHelper helper = new MimeMessageHelper(message, true);

        helper.setFrom(from,senderName);
        helper.setTo(userEmail);
        helper.setSubject("One Time Password (OTP) to verify your Email Address");
        String htmlContent = "<html>"
                + "<body>"
                + "<p>Dear User,</p>"
                + "<p>The One Time Password (OTP) to verify your Email Address is "
                + "<strong style='font-size:18px; color:blue;'>" + otp + "</strong>.</p>"
                + "<p>The One Time Password is valid for the next <strong>10 minutes</strong>.</p>"
                + "<p style='color:gray; font-size:12px;'>(This is an auto generated email, so please do not reply back. Email at "
                + "<a href='mailto:rsarthakverse123@gmail.com'>rsarthakverse123@gmail.com</a> if you need assistance.)</p>"
                + "<p>Regards,<br/>Sarthak Rastogi</p>"
                + "<img src='cid:policeOfficerImage' alt='Police Officer' style='width:100px; height:auto;'/>"
                + "</body>"
                + "</html>";
        helper.setText(htmlContent, true);
        javaMailSender.send(message);

    }
}
