<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include  file="../views/header.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <title>index page</title>
    </head>

    <body>
        <ul class="nav nav-pills">
            <li role="presentation" class="active"><a href="#">Home</a></li>
            <li role="presentation"><a href="${URL}/page/contact">Contact</a></li>
            <li role="presentation"><a href="">Action</a></li>
            <li role="presentation"><a href="${URL}/page/about">About us</a></li>
            <li role="presentation" class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">
                    More Information <span class="caret"></span>
                </a>
                <ul class="dropdown-menu">
                    <li role="presentation"><a href="">Action</a></li>
                    <li role="presentation"><a href="">Map</a></li>
                </ul>
            </li>
        </ul>
            
        <div class="container">
            <div>
            <a href="departments.jsp" class="btn btn-primary btn-lg active" role="button">Departments</a>
            <a href="${URL}/EmployeePage" class="btn btn-primary btn-lg active" role="button">Employees</a>
            <a href="${URL}/adminPanel" class="btn btn-primary btn-lg active" role="button">Admin panel</a>
            </div>
        </div>
            <script>
                $(document).on("ready",function (){
                    alert("hi");
                });
            </script>
</html>
