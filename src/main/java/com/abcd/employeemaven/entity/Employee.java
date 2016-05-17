/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abcd.employeemaven.entity;

import java.util.Date;

/**
 *
 * @author sharmila
 */
public class Employee {
    
    private int id,departmentId;
    private String firstName,lastName,email,address;
    private boolean status;
    private Date joinedDate;
    private Date effectiveDate;
    private Date modifiedDate;
    

    public Employee() {
    }

    public Employee(int id, int departmentId, String firstName, String lastName, String email, String address, boolean status) {
        this.id = id;
        this.departmentId = departmentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(Date joinedDate) {
        this.joinedDate = joinedDate;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", departmentId=" + departmentId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", address=" + address + ", status=" + status + ", joinedDate=" + joinedDate + ", effectiveDate=" + effectiveDate + ", modifiedDate=" + modifiedDate + '}';
    }
    
}