<%--
  Created by IntelliJ IDEA.
  User: zyf
  Date: 2018/1/3
  Time: 下午3:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"
         language="java" %>
<%--
    设置错误处理页面
    当1_hello页面出现异常时，会自动转发到2_error
--%>
<%@page errorPage="2_error.jsp"%>
<html>
<head>
    <title>1_HELLO</title>
</head>
<body>
    <%
        //是在service方法中的
        Object attribute =
            request.getAttribute("user");
        int a = 10/0;
        System.out.println(a);
    %>
    a的值为：<%=a%>
    <%!
        //是在类中的
        public void dodo(){

        }


        //这就是定义的成员变量
        private String name;
    %>
</body>
</html>
