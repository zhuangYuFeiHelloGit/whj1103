<%--
  Created by IntelliJ IDEA.
  User: zyf
  Date: 2017/12/29
  Time: 上午9:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <form action="insert" method="post">
      <label for="username">用户名</label>
      <input type="text" id="username" name="username">
      <label for="gender">性别</label>
      <input type="text" id="gender" name="gender">

      <input type="submit">
    </form>

    <a href="show.html">去看看数据</a>
  </body>
</html>
