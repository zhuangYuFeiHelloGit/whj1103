<%--
  Created by IntelliJ IDEA.
  User: zyf
  Date: 2018/1/3
  Time: 下午4:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>哈哈哈哈哈</h1>
    <%--
        相当于请求包含，是动态包含
        会先创建出1_hello.jsp文件的.java文件
        然后在包含进6.jsp
    --%>
    <jsp:include page="4_target.jsp"/>

</body>
</html>
