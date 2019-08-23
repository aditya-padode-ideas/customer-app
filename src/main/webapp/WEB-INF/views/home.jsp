<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Spring Customer App</title>
</head>
<body>
<h1>Spring Customer App</h1>
<h2>Select the desired action</h2>

<a href="getCustomer">Get Customer</a>
<br>

<a href="admin/saveCustomer">Save Customer(Only User1)</a>
<br>

<a href="admin/deleteCustomer">Delete Customer(Only User1)</a>
<br>

<a href="allCustomer">Get All Customer</a>
<br>

<br><br>
<br>
<a href="logout">Logout</a>
</body>
</html>