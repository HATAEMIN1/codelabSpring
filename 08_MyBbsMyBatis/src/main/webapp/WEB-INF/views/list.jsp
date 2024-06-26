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
<h2>뇽안</h2>
<c:forEach var="dto" items="${lists}">
    <div>${dto.id}/${dto.writer}
        /<a href="./view?id=${dto.id}">${dto.title}</a>/${dto.content}
    /<a href="./delete?id=${dto.id}">삭제</a>
    </div>
</c:forEach>
<a href="./writerForm">글쓰기</a>
</body>
</html>
