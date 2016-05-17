/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abcd.employeemaven.dao.impl;

import com.abcd.employeemaven.constant.DepartmentSQL;
import com.abcd.employeemaven.dao.DepartmentDao;
import com.abcd.employeemaven.entity.Department;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sharmila
 */
@Repository
public class DepartmentDaoImpl implements DepartmentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Department department) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Department department) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int id) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Department> getAll() throws ClassNotFoundException, SQLException {
        return jdbcTemplate.query(DepartmentSQL.GETALL, new RowMapper<Department>() {

            @Override
            public Department mapRow(ResultSet rs, int i) throws SQLException {
                return mapData(rs);
            }
        });
    }

    @Override
    public Department getById(int id) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Department searchByName(String name) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Department mapData(ResultSet rs) throws SQLException {

        Department department = new Department();
        department.setId(rs.getInt("department_id"));
        department.setDepartmentCode(rs.getString("department_code"));
        department.setDepartmentDescription(rs.getString("department_description"));
        department.setAddedDate(rs.getDate("added_date"));
        department.setModifiedDate(rs.getDate("modified_date"));
        department.setStatus(rs.getBoolean("status"));
        
        return department;

    }
}
