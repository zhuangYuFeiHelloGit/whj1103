<%--
  Created by IntelliJ IDEA.
  User: zyf
  Date: 2018/1/4
  Time: 下午3:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--
        使用EL可以获得JSP四大域中的域属性
        这与昨天学到的PageContext的全域查找
        是一个意思
        EL表达式的格式：
            ${}
        如果EL表达式找不到属性，则什么都不会显示

    --%>
    <%
        System.out.println(pageContext.getClass().getName());
    %>
    ${name}
</body>
</html>
