/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abcd.employeemaven.controller;

import com.sun.media.sound.ModelAbstractChannelMixer;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author sharmila
 */
@Controller
@RequestMapping(value = "/mail/*")
public class SendEmailController {
    
    @Autowired
    private JavaMailSender JavaMailSender;
    
    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView doSendEmail(HttpServletRequest request){
        String recipientAddress=request.getParameter("email");
        String subject=request.getParameter("subject");
        String message=request.getParameter("message");
        
        //console
        System.out.println("To: " + recipientAddress);
        System.out.println("Subject: " + subject);
        System.out.println("Message: " + message);
        
        //simple email object
        SimpleMailMessage email=new SimpleMailMessage();
        email.setTo(recipientAddress);
        email.setSubject(subject);
        email.setText(message);
        
        JavaMailSender.send(email);
        
      return new ModelAndView("redirect:EmployeePage");
    
}
}
