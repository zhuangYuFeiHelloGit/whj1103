<%--
  Created by IntelliJ IDEA.
  User: zyf
  Date: 2018/1/3
  Time: 上午9:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>主页</title>
    <script src="js/jquery-3.2.1.min.js"></script>
  </head>
  <body>
    <h1>用户名：<span id="username"></span></h1>
    <h1>密码：<span id="password"></span></h1>
  </body>
  <script type="text/javascript">
    $.getJSON("http://localhost:8080/day29/show",
        function (json,status) {
        if(status == "success"){
            $('#username').text(json['username']);
            $('#password').text(json['password']);
        }
    })



  </script>
</html>
