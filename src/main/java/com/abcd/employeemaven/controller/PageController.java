/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abcd.employeemaven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author sharmila
 */
@Controller
@RequestMapping(value = "/page")
public class PageController {

    @RequestMapping(value = "/about")
    public String getAboutPage() {
        return "about";
    }

    @RequestMapping(value = "/contact")
    public String getContactPage() {
        return "Contact";
    }
}
