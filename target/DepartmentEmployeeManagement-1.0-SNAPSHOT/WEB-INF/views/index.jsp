<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include  file="../views/header.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <title>index page</title>
    </head>

    <body>
        <div class="row">
            <a href="departments.jsp" class="btn btn-primary btn-lg active" role="button">Departments</a>
            <a href="${URL}/EmployeePage" class="btn btn-primary btn-lg active" role="button">Employees</a>
            <a href="${URL}/adminPanel" class="btn btn-primary btn-lg active" role="button">Admin panel</a>
        </div>
</html>
