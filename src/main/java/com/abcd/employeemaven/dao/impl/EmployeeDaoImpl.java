/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abcd.employeemaven.dao.impl;

import com.abcd.employeemaven.constant.EmployeeSQL;
import com.abcd.employeemaven.dao.EmployeeDao;
import com.abcd.employeemaven.entity.Employee;
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
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Employee employee) throws ClassNotFoundException, SQLException {
       return jdbcTemplate.update(EmployeeSQL.EMPLOYEE_INSERT, new Object[]{employee.getFirstName(),employee.getLastName(),employee.getEmail(),employee.getAddress(),employee.getDepartmentId(),employee.getEffectiveDate(),employee.isStatus()});
    }

    @Override
    public int update(Employee employee) throws ClassNotFoundException, SQLException {
      return jdbcTemplate.update(EmployeeSQL.UPDATE,new Object[]{ new Object[]{employee.getFirstName(),employee.getLastName(),employee.getEmail(),employee.getAddress(),employee.getDepartmentId(),employee.getEffectiveDate(),employee.getModifiedDate(),employee.isStatus()}});
    }

    @Override
    public int delete(int id) throws ClassNotFoundException, SQLException {
      return jdbcTemplate.update(EmployeeSQL.DELETE, new Object[]{id});
    }

    @Override
    public List<Employee> getAll() throws SQLException {
        return jdbcTemplate.query(EmployeeSQL.GETALL, new RowMapper<Employee>() {

            @Override
            public Employee mapRow(ResultSet rs, int i) throws SQLException {
                return mapData(rs);
            }
        });
    }

    @Override
    public Employee getById(int id) throws ClassNotFoundException, SQLException {
      return jdbcTemplate.queryForObject(EmployeeSQL.GETBYID, new Object[]{id}, new RowMapper<Employee>() {

            @Override
            public Employee mapRow(ResultSet rs, int i) throws SQLException {
                return mapData(rs);
            
            }
        });
    }

    @Override
    public Employee searchByName(String name) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Employee mapData(ResultSet rs) throws  SQLException {
        Employee employee = new Employee();
        employee.setId(rs.getInt("employee_id"));
        employee.setFirstName(rs.getString("employee_first_name"));
        employee.setLastName(rs.getString("employee_last_name"));
        employee.setEmail(rs.getString("email"));
        employee.setAddress(rs.getString("address"));
        employee.setJoinedDate(rs.getDate("joined_date"));
        employee.setModifiedDate(rs.getDate("modified_date"));
        employee.setEffectiveDate(rs.getDate("effective_date"));
        employee.setStatus(rs.getBoolean("status"));
        return employee;
    }
}
