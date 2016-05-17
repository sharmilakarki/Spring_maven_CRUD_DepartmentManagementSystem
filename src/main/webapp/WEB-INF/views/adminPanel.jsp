<%-- 
    Document   : adminPanel
    Created on : May 14, 2016, 7:34:39 PM
    Author     : sharmila
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../views/header.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Dashboard</title>
    </head>
    <body>

        <ul class="nav nav-pills">
            <li role="presentation" class="active"><a href="#">Home</a></li>
            <li role="presentation"><a href="">Contact</a></li>
            <li role="presentation"><a href="">Action</a></li>
            <li role="presentation"><a href="">About us</a></li>
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
            
            <div class="pull-left">
                <p>
                <a href="addEmployee" class="btn btn-success"><span class="glyphicon glyphicon-plus"/></a>
                </p>
            </div>
      


        <div class="pull-right">
            <p>
                <a href="EmployeePage" class="btn btn-success">
                    <span class="glyphicon glyphicon-plus"/></a>
            </p>
        </div>

    </div>
    <div class="container">

    </div>




</body>
</html>
