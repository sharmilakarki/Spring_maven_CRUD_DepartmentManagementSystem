/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abcd.employeemaven.service;

import com.abcd.employeemaven.dao.DepartmentDao;
import com.abcd.employeemaven.entity.Department;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sharmila
 */
@Service
public class DepartmentService {

    @Autowired
    private DepartmentDao departmentDao;

    public int insert(Department department) throws ClassNotFoundException, SQLException {
        return departmentDao.insert(department);
    }

    public int update(Department department) throws ClassNotFoundException, SQLException {
        return departmentDao.update(department);
    }

    public int delete(int id) throws ClassNotFoundException, SQLException {
        return departmentDao.delete(id);
    }

    public List<Department> getAll() throws ClassNotFoundException, SQLException {
        return departmentDao.getAll();
    }

    public Department getById(int id) throws ClassNotFoundException, SQLException {
        return departmentDao.getById(id);
    }

    public Department searchByName(String name) throws ClassNotFoundException, SQLException {
        return departmentDao.searchByName(name);
    }
}
