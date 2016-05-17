/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abcd.employeemaven.helper;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;



public class Email {
    private String From,To,subject,messageBody,host;

    public Email() {
    }

    
    public void sendMail(){
        Properties properties=System.getProperties();
        properties.setProperty("mail.smtp.host", host);
        Session session=Session.getDefaultInstance(properties);
        
        try{
            MimeMessage message=new MimeMessage(session);
            message.setFrom(new InternetAddress(host));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(To));
            message.setSubject(subject);
            message.setText(messageBody);
            
            Transport.send(message);
        }
        catch( MessagingException me){
            System.out.println(me.getMessage());
        }
    }
    public Email(String From, String To, String subject, String messageBody,String host) {
        this.From = From;
        this.To = To;
        this.subject = subject;
        this.messageBody= messageBody;
        this.host=host;
    }

    public String getFrom() {
        return From;
    }

    public void setFrom(String From) {
        this.From = From;
    }

    public String getTo() {
        return To;
    }

    public void setTo(String To) {
        this.To = To;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

   
    
    
    
}
