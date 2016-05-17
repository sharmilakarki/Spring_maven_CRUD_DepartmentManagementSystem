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

        <form:form class="form-addEmployee" modelAttribute="employee" action="${employeeRegistration}" method="POST" >
            <label for="firstName" class="sr-only">First Name</label>
            <input type="text" name="firstName" id="firstName" class="form-control" placeholder="firstName" required autofocus>
            <label for="lastName" class="sr-only">Last Name</label>
            <input type="text" name="email" id="email" class="form-control" placeholder="email" required autofocus>
            <label for="address" class="sr-only" >address</label>
            <input type="text" name="address" id="address" class="form-control" placeholder="address" required autofocus>
            <label for="departmentId" class="sr-only">department Id</label>
            <input type="text" name="departmentId" id="departmentId" class="form-control" value="${course.departmentId}"  required autofocus>
            <label for="effectiveDate" class="sr-only">effective Date</label>
            <input type="text" name="effectiveDate" id="effectiveDate" class="form-control" placeholder="effectiveDate" required autofocus>
            <div>

                <label>Terms and conditions</label>
                <input type="checkbox" name="status" id="staus" class="form-control" value="status" required autofocus>

            </div>

            <button class="btn btn-lg btn-block btn-primary" type="submit">Register</button>
          
        </form:form>
</div> 
    </body>

</html>
