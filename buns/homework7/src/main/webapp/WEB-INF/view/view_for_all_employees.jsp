<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<%--
  Created by IntelliJ IDEA.
  User: rredl
  Date: 20.12.2022
  Time: 21:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Information</title>
</head>
<body>

<h3>Information for all employees</h3>
<br><br>

    <security:authorize access="hasRole('hr')">
        <input type="button" value="Salary"
               onclick="window.location.href = 'hr_info'">
        only for HR staff
        <br><br>
    </security:authorize>

    <security:authorize access="hasRole('manager')">
        <input type="button" value="Performance"
               onclick="window.location.href = 'manager_info'">
        only for Managers
    </security:authorize>

</body>
</html>