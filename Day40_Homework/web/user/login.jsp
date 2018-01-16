<%--
  Created by IntelliJ IDEA.
  User: zyf
  Date: 2018/1/16
  Time: 上午9:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
    <form action="/user/login.action" method="post">
        <input type="text" name="username">
        <input type="password" name="password">
        <input type="submit">
    </form>
</body>
</html>
