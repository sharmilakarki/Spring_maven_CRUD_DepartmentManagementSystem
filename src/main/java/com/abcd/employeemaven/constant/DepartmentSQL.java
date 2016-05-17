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
    public final static String INSERT = "INSERT INTO " + TableConstant.TABLE_DEPARTMENT + "(department_id,department_code,department_name,department_description,status)"
            + "Values(?,?,?,?,?,?,?)";
    public final static String GETALL = "select * from " + TableConstant.TABLE_DEPARTMENT;
    public final static String GETBYID = "select * from " + TableConstant.TABLE_DEPARTMENT + " where id = ?";
    public final static String UPDATE="Update table "+TableConstant.TABLE_DEPARTMENT +" SET department_code=?, department_name=?, department_description=?, added_date=?,modified_date=?,status=?"
            + "where id=?";
    public final static String DELETE="Delete from "+TableConstant.TABLE_DEPARTMENT +" WHERE id =?";
    public final static String GETBYNAME="select * from "+TableConstant.TABLE_DEPARTMENT +" Where department_name=?";
            
}
