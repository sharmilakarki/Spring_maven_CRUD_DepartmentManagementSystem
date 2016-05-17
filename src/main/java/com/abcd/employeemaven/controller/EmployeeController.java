/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abcd.employeemaven.controller;

import com.abcd.employeemaven.entity.Department;
import com.abcd.employeemaven.entity.Employee;
import com.abcd.employeemaven.service.DepartmentService;
import com.abcd.employeemaven.service.EmployeeService;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServlet;
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
@RequestMapping(value = "/")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    private DepartmentService departmentService;

//    @Autowired
//    private JavaMailSender javaMailSender;
    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/EmployeePage", method = RequestMethod.GET)

    public ModelAndView viewEmployees(ModelMap map, HttpServletRequest request) throws ClassNotFoundException, SQLException {

        List<Employee> employeeList = new ArrayList<>();
        employeeList = employeeService.getAll();
        List<Department> departmentList = new ArrayList<Department>();
        //departmentList=departmentService.getAll();

        for (Employee e : employeeList) {
            System.out.println(e);
        }
      //  map.addAttribute("employee", employeeList);
        //map.addAttribute("employee", employeeService.getByDepartmentId(departmentId));
        Map<String,Object> model=new HashMap<String, Object>();
        model.put("employee", employeeList);
//        model.put("department", departmentList);
        //return "EmployeePage";
        return new ModelAndView("EmployeePage", "model",model);

    }

    @RequestMapping("/saveEmployee")
    public ModelAndView registerUser(@ModelAttribute("employee") Employee employee, BindingResult result) throws ClassNotFoundException, SQLException {
        employeeService.insert(employee);
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
    public ModelAndView editEmployee(@RequestParam int id, @ModelAttribute("employee") Employee employee, BindingResult result) throws ClassNotFoundException, SQLException {
        employee = employeeService.getById(id);
        return new ModelAndView("editEmployee", "employee", employee);
    }

    @RequestMapping("/updateEmployee")
    public ModelAndView saveEditedEmployee(@ModelAttribute("employee") Employee employee, BindingResult result) throws ClassNotFoundException, SQLException {

        employeeService.update(employee);
        System.out.println(employee.toString());
        return new ModelAndView("redirect:EmployeePage");
    }

    @RequestMapping("delete")
    public ModelAndView deleteEmployee(@RequestParam int id) throws ClassNotFoundException, SQLException {
        employeeService.delete(id);
        return new ModelAndView("redirect:EmployeePage");
    }

}
