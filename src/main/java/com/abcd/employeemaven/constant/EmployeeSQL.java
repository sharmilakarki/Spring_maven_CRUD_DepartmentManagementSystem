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
public class EmployeeSQL {
    public final static String EMPLOYEE_INSERT = "INSERT INTO " + TableConstant.TABLE_EMPLOYEE + "(employee_first_name,employee_last_name,email,address,department_id,effective_date,status)"
            + "Values(?,?,?,?,?,?,?)";
    public final static String GETALL = "select * from " + TableConstant.TABLE_EMPLOYEE;
    public final static String GETBYID = "select * from " + TableConstant.TABLE_EMPLOYEE + " where employee_id = ?";
    public final static String UPDATE="Update table "+TableConstant.TABLE_EMPLOYEE +" SET employee_first_name=?,employee_first_name=?,email=?,address=?,department_id=?,modified_date=?,status=?)"
            + "where id=?";
    public final static String DELETE="Delete from "+TableConstant.TABLE_EMPLOYEE +" WHERE employee_id =?";
    public final static String GETBYNAME="select * from "+TableConstant.TABLE_EMPLOYEE +" Where employee_first_name=?";
    public final static String GETDEPAARTMENTID="select department_id from "+TableConstant.TABLE_EMPLOYEE ;
                    
}
