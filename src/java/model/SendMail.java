/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.security.Security;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author PT
 */
public class SendMail {

//    private static final String SMTP_HOST_NAME = "smtp.gmail.com";
//    private static final String SMTP_PORT = "465";
//    private static final String emailMsgTxt = "สวัสดีครับ อิอิ My name is Pentai eiei";
//    private static final String emailSubjectTxt = "Test Sendmail";
//    private static final String emailFromAddress = "penthaizza@gmail.com";
//    private static final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
//    private static final String[] sendTo = {"oplo_and_punch@hotmail.com"};

//    public static void main(String args[]) throws Exception {
//
//        Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
//        SendMail sendMailThroughJava = new SendMail();
////        sendMailThroughJava.sendSSLMessage(sendTo, emailSubjectTxt,emailMsgTxt, emailFromAddress);
//        System.out.println("Sucessfully sent mail to all Users");
//    }

    /**
     * @param recipients
     * @param subject
     * @param message
     * @param from
     * @throws MessagingException
     */
    public static void send(String recipients, String subject,String message) {

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("patiphanth@gmail.com","54E9B250@");
            }
        });
        
        try {
            MimeMessage msg = new MimeMessage(session);
            msg.setFrom("patiphanth@gmail.com");
            msg.setRecipient(Message.RecipientType.TO, new InternetAddress(recipients));
            msg.setSubject(subject);
            msg.setText(message);
            
            Transport.send(msg);
            System.out.println("Success send mail");

        } catch (MessagingException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
