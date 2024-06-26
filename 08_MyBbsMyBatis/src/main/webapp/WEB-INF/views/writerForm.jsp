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
<h2>mybbs writer</h2>
<form action="writer" method="post">
<table width="400" cellpadding="0" cellspacing="0" border="1">
    <tr>
        <td>작성자</td>
        <td><input type="text" name="writer"></td>
    </tr><tr>
        <td>제목</td>
        <td><input type="text" name="title"></td>
    </tr><tr>
        <td>내용</td>
        <td><input type="text" name="content"></td>
    </tr>
</table>
    <input type="submit" value="입력">
</form>
</body>
</html>
