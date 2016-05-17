/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abcd.employeemaven.dao;

import com.abcd.employeemaven.entity.Department;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author sharmila
 */
public interface DepartmentDao {
     int insert(Department course) throws ClassNotFoundException, SQLException;

    int update(Department course) throws ClassNotFoundException, SQLException;

    int delete(int id) throws ClassNotFoundException, SQLException;

    List<Department> getAll() throws ClassNotFoundException, SQLException;

    Department getById(int id) throws ClassNotFoundException, SQLException;

    Department searchByName(String name) throws ClassNotFoundException, SQLException;
}
