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
    <title>Title</title>
</head>
<body>
<h2>join</h2>
<c:forEach var="dto" items="${order1}">
    <div>${dto.ono1}/${dto.cname1} /${dto.cjob1}</div>
</c:forEach>
</body>
</html>
