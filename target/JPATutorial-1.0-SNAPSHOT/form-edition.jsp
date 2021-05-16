<%--
  Created by IntelliJ IDEA.
  User: Robinson
  Date: 15/05/2021
  Time: 10:47 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="./create-edition">
    <input type="hidden" id="bookId" name="bookId" value ="<%= request.getParameter("book_id") %>">

    Book description: <input type="text" id="description" name="description">
    <br />
    Book date: <input type="date" id="date" name="date">
    <br />
    <input type="submit" value="Create edition!">
</form>
</body>
</html>
