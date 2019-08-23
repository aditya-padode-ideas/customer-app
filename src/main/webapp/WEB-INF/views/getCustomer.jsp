<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Spring Customer App</title>
</head>
<body>
<h1>Spring Customer App</h1>
<h2>Type the Customer's name</h2>
 <form method="post" action="getCustomer">  
    Enter Customer Name : <input type="text" name="name"/>
    <input type="submit" value="Submit">
</form>
</body>
</html>