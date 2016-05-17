/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abcd.employeemaven.dao.impl;

import com.abcd.employeemaven.dao.SendEmailDao;
import com.abcd.employeemaven.helper.Email;

/**
 *
 * @author sharmila
 */
public class SendEmailDaoImpl implements SendEmailDao{

    @Override
    public void sendEmail() {
        Email email =new Email();
        email.setFrom(null);
        email.sendMail();
    }
    
}
