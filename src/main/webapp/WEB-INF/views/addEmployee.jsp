<%-- 
    Document   : addEmployee
    Created on : May 14, 2016, 7:37:37 PM
    Author     : sharmila
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include  file="../views/header.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee Page</title>
    </head>
    <body>

        <div style="color: teal; font-size: 30px" class="container">
            <h1>Employee Registration Form</h1> 

        <c:set var="employeeRegistration" value="saveEmployee"/>

        <form class="form-addEmployee" modelAttribute="employee" action="${employeeRegistration}" method="POST" >
            <label for="firstName" class="sr-only">First Name</label>
            <input type="text" name="firstName" id="firstName" class="form-control" placeholder="firstName" required autofocus></br>
             
            <label for="lastName" class="sr-only">Last Name</label>
            <input type="text" name="lastName" id="lastName" class="form-control" placeholder="lastName" required autofocus></br>
            
            <label for="email" class="sr-only">Email</label>
            <input type="text" name="email" id="email" class="form-control" placeholder="email" required autofocus></br>
           
            <label for="address" class="sr-only" >address</label>
            <input type="text" name="address" id="address" class="form-control" placeholder="address" required autofocus></br>
           
            <label for="departmentId" class="sr-only">department Id</label>
            <input type="text" name="departmentId" id="departmentId" class="form-control" value="${course.departmentId}"  required autofocus></br>
            
             <label for="effectiveDate" class="sr-only">Effective date</label>
            <input type="text" name="effectiveDate" id="effectiveDate" class="form-control" placeholder="effective date"  required autofocus></br>
            
            <input type="checkbox" name="status" value=""/></br>
            <button class="btn  btn-block btn-primary" type="submit">Register</button>
          
        </form>
</div> 
    </body>

</html>
