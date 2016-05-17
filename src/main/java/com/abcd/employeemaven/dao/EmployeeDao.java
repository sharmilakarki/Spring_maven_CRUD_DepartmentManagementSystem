/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abcd.employeemaven.dao;

import com.abcd.employeemaven.entity.Employee;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author sharmila
 */
public interface EmployeeDao {

    int insert(Employee employee);

    int update(Employee employee) ;

    int delete(int id) ;

    List<Employee> getAll() ;

    Employee getById(int id) ;
    

    Employee searchByName(String name) ;
    
    List<Employee> getByDepartmentId(int id);
}
