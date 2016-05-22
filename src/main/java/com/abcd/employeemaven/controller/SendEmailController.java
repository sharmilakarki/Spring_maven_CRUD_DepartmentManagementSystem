/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abcd.employeemaven.controller;

import com.abcd.employeemaven.helper.Email;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author sharmila
 */
@Controller
@RequestMapping(value = "/mail/send")
public class SendEmailController {

//    @Autowired
//    private JavaMailSender javaMailSender;

    
    
    @RequestMapping(method = RequestMethod.POST)
    public String doSendEmail(HttpServletRequest request,HttpServletResponse response ,@ModelAttribute("email") Email email)  throws IOException{
        String RecieptentEmail = request.getParameter("email");
        String subject = request.getParameter("subject");
        String message = request.getParameter("message");
        

        //console
        System.out.println("To: " + RecieptentEmail);
        System.out.println("Subject: " + subject);
        System.out.println("Message: " + message);

        //simple email object
//        SimpleMailMessage email=new SimpleMailMessage();
        
        email.setTo(RecieptentEmail);
        
        email.setHost("smtp.ntc.net.np");
        email.setFrom("abcdgroupproject@gmail.com");
        email.setSubject(subject);
        email.setMessageBody(message);
       
        email.sendMail();
       
         
        return "redirect:/";
       
    }
//    
    
}
    

