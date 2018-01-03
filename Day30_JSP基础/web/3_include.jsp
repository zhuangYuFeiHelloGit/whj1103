<%--
  Created by IntelliJ IDEA.
  User: zyf
  Date: 2018/1/3
  Time: 下午4:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%@include file="4_target.jsp"%>
    <%--
        静态包含include指令
        是在4_target.jsp被编译成.java文件之前
        就添加进3_include.jsp文件中了
        所以只能查看到3_include.java
    --%>
    <h1>我是Include</h1>
</body>
</html>
