/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abcd.employeemaven.constant;

/**
 *
 * @author sharmila
 */
public class DepartmentSQL {
    public final static String Course_insert = "INSERT INTO " + TableConstant.TABLE_EMPLOYEE + "(department_id,department_code,department_name,department_description,added_date,modified_date,status)"
            + "Values(?,?,?,?,?,?,?)";
    public final static String GETALL = "select * from " + TableConstant.TABLE_EMPLOYEE;
    public final static String GETBYID = "select * from " + TableConstant.TABLE_EMPLOYEE + " where id = ?";
    public final static String UPDATE="Update table "+TableConstant.TABLE_EMPLOYEE +" SET department_code=?, department_name=?, department_description=?, added_date=?,modified_date=?,status=?"
            + "where id=?";
    public final static String DELETE="Delete from "+TableConstant.TABLE_EMPLOYEE +" WHERE id =?";
    public final static String GETBYNAME="select * from "+TableConstant.TABLE_EMPLOYEE +" Where department_name=?";
            
}
