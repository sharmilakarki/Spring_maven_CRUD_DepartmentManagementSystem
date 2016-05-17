/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abcd.employeemaven.dao;

import com.abcd.employeemaven.entity.Department;
import java.util.List;

/**
 *
 * @author sharmila
 */
public interface DepartmentDao {
     int insert(Department department) ;

    int update(Department department);

    int delete(int id) ;

    List<Department> getAll() ;

    Department getById(int id) ;

    Department searchByName(String name) ;
}
