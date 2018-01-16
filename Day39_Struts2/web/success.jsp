<%--
  Created by IntelliJ IDEA.
  User: zyf
  Date: 2018/1/15
  Time: 下午4:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c"
          uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>成功</title>
</head>
<body>

    <ul>
        <c:forEach var="user" items="${requestScope.users}">
            <li>${user.username}----${user.age}</li>
        </c:forEach>
    </ul>






</body>
</html>
