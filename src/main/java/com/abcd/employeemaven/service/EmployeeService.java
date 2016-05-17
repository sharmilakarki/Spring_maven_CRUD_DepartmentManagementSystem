/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abcd.employeemaven.service;

import com.abcd.employeemaven.dao.EmployeeDao;
import com.abcd.employeemaven.entity.Employee;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sharmila
 */
@Service
public class EmployeeService {
    
    
    @Autowired
    private EmployeeDao employeeDao;

  public  int insert(Employee employee) throws ClassNotFoundException, SQLException {
        return employeeDao.insert(employee);
    }

   public int update(Employee employee) throws ClassNotFoundException, SQLException {
        return employeeDao.update(employee);
    }

   public int delete(int id) throws ClassNotFoundException, SQLException {
        return employeeDao.delete(id);
    }

  public  List<Employee> getAll() throws ClassNotFoundException, SQLException {
        return employeeDao.getAll();
    }

   public Employee getById(int id) throws ClassNotFoundException, SQLException {
        return employeeDao.getById(id);
    }

   public Employee searchByName(String name) throws ClassNotFoundException, SQLException {
        return employeeDao.searchByName(name);
    }
   public List<Employee> getByDepartmentId(int id) {
       return employeeDao.getByDepartmentId(id);
    }
}
