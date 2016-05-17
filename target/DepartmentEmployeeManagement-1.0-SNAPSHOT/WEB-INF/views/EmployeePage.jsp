<%-- 
    Document   : EmployeePage
    Created on : May 13, 2016, 9:22:15 PM
    Author     : sharmila
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../views/header.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee</title>
    </head>
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
        <body>
            
            <h1>Employee Information</h1>

            <form>
                <input type="text" id="search" placeholder="search name"/>

            </form>


            <table class="table table-bordered table-striped" id="tblData">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>FIRST NAME</th>
                        <th>LAST NAME</th>
                        <th>EMAIL</th>
                        <th>ADDRESS</th>
                        <th>DEPARTMENT ID</th>
                        <th>JOINED DATE</th>
                        <th>EFFECTIVE DATE</th>
                        <th>MODIFIED DATE</th>
                        <th>STATUS</th>
                        <th>ACTION</th>
                    </tr>
                </thead>
                <tbody>
<!--                    <c:forEach var="employee" items="${employee}">
                        <tr>
                            <td>${employee.id}</td>
                            <td>${employee.firstName}</td>
                            <td>${employee.lastName}</td>
                            <td>${employee.email}</td>
                            <td>${employee.address}</td>
                            <td>${employee.departmentId}</td>
                            <td>${employee.joinedDate}</td>
                            <td>${employee.effectiveDate}</td>
                            <td>${employee.modifiedDate}</td>
                            <td>${employee.status}</td>
                            <td><a href="${URL}/edit?id=${employee.id}" class="btn btn-success"><span class="glyphicon glyphicon-edit"/></a>
                                &nbsp;&nbsp;
                                <a href="delete?id=${employee.id}" class="btn btn-danger"><span class="glyphicon glyphicon-remove"/></a>
                            </td>
                        </tr>
                    </c:forEach>
                        -->
                        
                        <c:forEach var="employee" items="${model.employee}">
                        <tr>
                            <td>${employee.id}</td>
                            <td>${employee.firstName}</td>
                            <td>${employee.lastName}</td>
                            <td>${employee.email}</td>
                            <td>${employee.address}</td>
                            <td>${employee.departmentId}</td>
                            <td>${employee.joinedDate}</td>
                            <td>${employee.effectiveDate}</td>
                            <td>${employee.modifiedDate}</td>
                            <td>${employee.status}</td>
                           
                            <td><a href="${URL}/edit?id=${employee.id}" class="btn btn-success"><span class="glyphicon glyphicon-edit"/></a>
                                &nbsp;&nbsp;
                                <a href="delete?id=${employee.id}" class="btn btn-danger"><span class="glyphicon glyphicon-remove"/></a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>

            </table>
    </div>
    <script>
      $("#search").on("keyup", function () {
            var value = $(this).val();

            $("table tr").each(function (index) {
                if (index != 0) {

                    $row = $(this);

                    var id = $row.find("td").text();

                    if (id.indexOf(value) != 1) {
                        $(this).hide();
                    }
                    else {
                        $(this).show();
                    }
                    if (value == "") {
                        $(this).show();
                    }
                }
            });
        })

    
    </script>
</body>
</html>
