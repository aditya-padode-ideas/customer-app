<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Spring Customer App</title>
</head>
<body>
<h1>Spring Customer App</h1>
<h2>Type the Customer details to save</h2>
 <form method="post" action="saveCustomer">  
    Enter Customer Name : <input type="text" name="name"/>
    Enter Customer Email : <input type="text" name="email"/>
    Enter Customer City : <input type="text" name="city"/>
    <input type="submit" value="Submit">
</form>
</body>
</html>