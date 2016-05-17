<%-- 
    Document   : header.jsp
    Created on : May 13, 2016, 9:23:44 PM
    Author     : sharmila
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="URL" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link rel="stylesheet" href="${URL}/static/bootstrap/css/bootstrap.min.css" type="text/css" />
        <link  href="${URL}/static/bootstrap/js/bootstrap.min.js" type="text/javascript" /> 
        <script src="${URL}/static/extraJS/jquery.min.js" type="text/javascript"></script>
    </head>