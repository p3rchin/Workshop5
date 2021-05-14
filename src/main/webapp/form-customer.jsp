<%--
  Created by IntelliJ IDEA.
  User: Robinson
  Date: 13/05/2021
  Time: 10:09 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Customer</title>
</head>
<body>
<form method="get" action="create-customer">
    Customer email: <input type="email" id="email" name="email">
    <br>
    Customer Nombre: <input type="text" id="firtsName" name="firtsName">
    <br>
    Customer Apellido: <input type="text" id="lastName" name="lastName">
    <br>
    Customer Genero: <input type="text" id="gender" name="gender">
    <br>
    Customer Edad: <input type="number" id="age" name="age">

    <input type="submit" value="Create customer!">
</form>
</body>
</html>
