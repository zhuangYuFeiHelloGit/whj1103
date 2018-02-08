<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: zyf
  Date: 2018/1/16
  Time: 上午11:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<form action="">
    username: <input><br>
    password: <input><br>
    验证码: <input name="code" size="4">
    <img src="${pageContext.request.contextPath}/codeImg.action"><br>
    <input type="submit" value="登录">
</form>
</body>
</html>
