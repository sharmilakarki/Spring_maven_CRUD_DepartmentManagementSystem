<%-- 
    Document   : editEmployee
    Created on : May 15, 2016, 6:28:17 PM
    Author     : sharmila
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../views/header.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Employee Page</title>
        <link rel="stylesheet" href="${URL}/static/css/myForm.css"/>
    </head>
    <body>

        <div class="container">
            <h1>Edit Employee</h1>
            <c:url var="employeeEdit" value="updateEmployee" />
                     <form id="updateCourse" modelAttribute="employee" method="POST" class="form-group" action="${employeeEdit}">
                <table width="400px" height="150px" class="table table-bordered table-striped">  
                    <tr>  
                        <td><label path="firstName">First Name</label></td>  
                        <td><input path="firstName" value="${employee.firstName}" /></td>  
                    </tr>  
                    <tr>  
                        <td><label path="lastName">Last Name </label></td>  
                        <td><input path="lastName" value="${employee.lastName}"/></td>  
                    </tr> 
                    <tr>  
                        <td><label path="email">Email</label></td>  
                        <td><input path="email" value="${employee.email}"/></td> 
                    </tr> 
                    <tr>  
                        <td><label path="address">Address </label></td>  
                        <td><input path="address" value="${employee.address}"/></td>  
                    </tr> 
                    <tr>  
                        <td><label path="departmentId">Department Id</label></td>  
                        <td><input path="departmentId" value="${employee.departmentId}"/></td>  

                    </tr>  

                    <tr>  
                        <td><label path="modifiedDate"> Modified Date</label></td>  
                        <td><input path="modifiedDate" value="${employee.modifiedDate}"/></td>  
                    </tr> 
                    <tr>  
                        <td><label path="status"> Status</label></td>  
                        <td><input path="status" value="${employee.status}"/></td>  
                    </tr> 
                    <tr>
                    <input type="hidden" value="${employee.id}"/>
                    </tr>
                    <tr>
                        <td>
                            <label path="checkbox">Notify department change in email</label>
                            <input path="checkbox"type="checkbox" id="MailSendCheckbox"/>
                        </td>
                    </tr>
                    <tr>  
                        <td></td>  
                        <td><button type="submit" class="btn btn-success">save</button> 
                        </td>  
                    </tr>  
                </table>  
            </form>  
        </div>
        
       <div class="container" id="mail" height="200px">
            <h1>Email Form</h1>
            <c:url var="sendMail" value="mail/send" />
            <form method="POST" action="${sendMail}" class="form-group">
                <table>
                    <tr>
                        <td>  <label path="email">Email to:</label></td>
                        <td>   <input path="email" name="email" value="${employee.email}"/></td>
                    </tr>
                    <tr>
                        <td>
                            <label path="subject">Subject</label></td>
                        <td>  <input path="subject" name="subject" value="Department changed"/></td>

                    </tr>
                    <tr>
                        <td>
                            <label path="message">Message</label></td>
                        <td> <input path="message" name="message" value="Your department has been changed to ${employee.departmentId}"/></td>
                    </tr>
                    <tr>
                        <td>
                            <button type="submit"  id="sendEmailBtn"><span class="glyphicon glyphicon-send"</button>
                        </td>
                    <tr>
                </table>
            </form>

        </div>
        <script>
            $("#MailSendCheckbox").change(function(){
                $("#mail").toggle();
            });

        </script>
        
    </body>
</html>
