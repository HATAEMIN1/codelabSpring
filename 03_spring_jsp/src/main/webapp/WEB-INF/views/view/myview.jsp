<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: gkxoa
  Date: 2024-06-20
  Time: 오후 12:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>안녕하세요 마이뷰입니다</h2>
    <div>
        <c:forEach var="mylist" items="${lists}">
            <div>
                    ${mylist}
            </div>

        </c:forEach>
    </div>
</body>
</html>
