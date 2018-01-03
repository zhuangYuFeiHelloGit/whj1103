<%--
  Created by IntelliJ IDEA.
  User: zyf
  Date: 2018/1/3
  Time: 下午3:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <%--<%=application.getAttribute("username")%>--%>
    <%
      if(session.getAttribute("username")
              != null){

    %>

        <h1>登录成功了，显示主页信息</h1>

    <%
      }else {
    %>

        <h1><a href="login.html">请去登录</a></h1>
    <%
      }
    %>
  </body>
</html>
