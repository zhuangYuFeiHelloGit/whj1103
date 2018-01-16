<%--
  Created by IntelliJ IDEA.
  User: zyf
  Date: 2018/1/16
  Time: 下午2:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>动态参数</title>
</head>
<body>

    <h1>访问active.action的</h1>
    <form action="active.action" method="post">
        <input type="text" name="username">
        <input type="text" name="password">
        <input type="submit">
    </form>
    <h1>访问ognl.action的</h1>
    <form action="ognl.action" method="post">
        <input type="text" name="student.username">
        <input type="text" name="student.age">
        <input type="submit">
    </form>
    <h1>访问model.action的</h1>
    <form action="model.action" method="post">
        <input type="text" name="username">
        <input type="text" name="age">
        <input type="submit">
    </form> type="submit">
    <h1>访问val.action的</h1>
    <form action="val.action" method="post">
        <input type="text" name="student.username">
        <input type="text" name="student.age">
        <input type="submit">
    </form>
    <h1>访问single.action的</h1>
    <form action="single.action" method="post">
        <input type="text" name="single">
        <input type="submit">
    </form>
    <h1>访问dec.action的</h1>
    <form action="dec.action" method="post">
        <input type="text" name="name">
        <input type="submit">
    </form>
</body>
</html>
