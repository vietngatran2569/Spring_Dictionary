<%--
  Created by IntelliJ IDEA.
  User: vietngatran
  Date: 07/11/2019
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/translate" method="get">
    <h1>Dictionary</h1>
    <label>Word</label>
    <input type="text" placeholder="input text" name="word">
    <input type="submit" value="Translate">
    <br/>
    <p>${result}</p>
</form>
</body>
</html>
