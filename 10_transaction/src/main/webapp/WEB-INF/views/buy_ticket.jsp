<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%--
  Created by IntelliJ IDEA.
  User: gkxoa
  Date: 2024-06-24
  Time: 오후 12:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ticket</title>
</head>
<body>
<h2>ticket</h2>
<form action="./buy_ticket_card">
    고객: <input type="text" name="consumerId"><br>
    고객수: <input type="text" name="amount"><br>
    에러넣기: <input type="text" name="error" value="0"><br>
    <input type="submit" value="구매">
</form>
</body>
</html>
