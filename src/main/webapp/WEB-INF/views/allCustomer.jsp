<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Spring Customer App</title>
</head>
<body>
<h1>Spring Customer App</h1>

<h2>Show Customer</h2>
<table width="50%">
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Email</th>
		<th>City</th>
	</tr>
	
	<c:forEach items="${customers}" var="customer">
		<tr>
			<td>${customer.id}</td>
			<td>${customer.name}</td>
			<td>${customer.email}</td>
			<td>${customer.city}</td>
		</tr>
	</c:forEach>
</table>	
<br/>
<br>

<a href="/">Go back</a>
</html>