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

    int insert(Employee employee) throws ClassNotFoundException, SQLException;

    int update(Employee employee) throws ClassNotFoundException, SQLException;

    int delete(int id) throws ClassNotFoundException, SQLException;

    List<Employee> getAll() throws ClassNotFoundException, SQLException;

    Employee getById(int id) throws ClassNotFoundException, SQLException;
    

    Employee searchByName(String name) throws ClassNotFoundException, SQLException;
}
