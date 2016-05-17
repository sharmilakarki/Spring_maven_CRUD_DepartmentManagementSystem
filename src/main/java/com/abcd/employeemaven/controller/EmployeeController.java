/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abcd.employeemaven.controller;


import com.abcd.employeemaven.dao.EmployeeDao;
import com.abcd.employeemaven.entity.Employee;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author sharmila
 */
@Controller
@RequestMapping(value = {"/"})
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;
    
//    @Autowired
//    private JavaMailSender javaMailSender;
   
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    
    @RequestMapping(value = "/EmployeePage", method = RequestMethod.GET)

    public String index(ModelMap mv) throws ClassNotFoundException, SQLException {

       
        mv.addAttribute("employee", employeeDao.getAll());
        
        return "EmployeePage";

    }

    @RequestMapping(value = "")
    public String doSendEmail(HttpServletRequest request){
        String recipientAddress=request.getParameter("email");
        String subject=request.getParameter("subject");
        String message=request.getParameter("message");
        
        //console
        System.out.println("To: " + recipientAddress);
        System.out.println("Subject: " + subject);
        System.out.println("Message: " + message);
        
        //simple email object
        //SimpleMailMessage 
        return "mailSend";
    
}
    @RequestMapping("saveEmployee")
    public ModelAndView registerUser(@ModelAttribute("employee") Employee employee) throws ClassNotFoundException, SQLException {
        employeeDao.insert(employee);
        System.out.println(employee.toString());
        return new ModelAndView("redirect:EmployeePage");
    }

    @RequestMapping(value = "/addEmployee")
    public ModelAndView addEmployee(@ModelAttribute Employee employee, BindingResult result) {
        return new ModelAndView("addEmployee");
    }

    @RequestMapping(value = "/adminPanel", method = RequestMethod.GET)
    public String adminPanel(ModelMap modelMap) throws ClassNotFoundException, SQLException {

        return "adminPanel";
    }

    @RequestMapping("edit")
    public ModelAndView editEmployee(@RequestParam int id, @ModelAttribute("employee") Employee employee ,BindingResult result) throws ClassNotFoundException, SQLException {
        employee = employeeDao.getById(id);
        return new ModelAndView("editEmployee", "employee", employee);
    }
    @RequestMapping("/updateEmployee")
    public ModelAndView saveEditedEmployee(@RequestParam int id, @ModelAttribute Employee employee ,BindingResult result) throws ClassNotFoundException, SQLException {
         employeeDao.update(employee);
        return new ModelAndView("redirect:EmployeePage");
    }
     @RequestMapping("delete")
    public ModelAndView deleteEmployee(@RequestParam int id) throws ClassNotFoundException, SQLException {
        employeeDao.delete(id);
        return new ModelAndView("redirect:EmployeePage");
    }

}
