<%-- 
    Document   : emailForm
    Created on : May 17, 2016, 9:18:20 AM
    Author     : sharmila
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../views/header.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Email form page</title>
    </head>
    <body>
        <div class="container"> 
            <h1>Email Form</h1>
            <form:form>
                <form:label path="email">Email to:</form:label>
                <form:input path="email" name="email" value="${employee.email}"/></br>
                <form:label path="subject">Subject</form:label>
                <form:input path="subject" name="subject"/></br>
                <form:label path="message">Message</form:label>
                <form:input path="message" name="message"/></br>
                <button type="submit" id="sendEmailBtn"><span class="glyphicon glyphicon-send"</button>
                
            </form:form>
        </div>

    </body>
</html>
