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
<h2>mybbs 내용보기</h2>
    작성자: ${dto.writer} <br>
    제목: ${dto.title} <br>
    내용: ${dto.content} <br>
<a href="./list">목록</a>

</body>
</html>
