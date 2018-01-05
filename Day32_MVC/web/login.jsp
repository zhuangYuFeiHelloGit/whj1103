<%--
  Created by IntelliJ IDEA.
  User: zyf
  Date: 2018/1/5
  Time: 下午3:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:if test="${requestScope.errorMsg != null}">
        <h1>${requestScope.errorMsg}</h1>
    </c:if>
    <form action="user" method="post">

        <input type="hidden"
               name="method"
               value="login">
        <input type="text" name="username">
        <input type="text" name="password">
        <input type="submit">


    </form>
</body>
</html>
