<%--
  Created by IntelliJ IDEA.
  User: zyf
  Date: 2018/1/5
  Time: 上午9:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c"
          uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>core</title>
</head>
<body>
<%--直接显示在jsp页面中--%>
<%--value属性中可以使用EL表达式查找域属性--%>
<c:out value="你好"/>
<c:out value="${requestScope.user.gender}"
       default="找不到啊"/>

<%--test：判断条件，里面写一个EL表达式做判断--%>

<c:if test="${6 >= 6}"
      var="result"
      scope="request">
    <h1>抽刀断水水更流，举杯消愁愁更愁</h1>
</c:if>

<%--如果下面又需要用到相同的判断条件--%>
<%--则可以直接使用request域中的result变量来判断--%>
<%--该变量，就保存了上面那个if判断的结果--%>
<c:if test="${result}">
    <h1>人生得意须尽欢，莫使金樽空对月</h1>
</c:if>

<table>
    <tr>
        <th>我是表头</th>
    </tr>
    <%--<c:forEach begin="0" end="10" step="2">--%>
        <%--<tr>--%>
            <%--<td>你好啊</td>--%>
        <%--</tr>--%>
    <%--</c:forEach>--%>

    <%--
        这个写法，就是java中的增强for循环
        user是在循环中使用的变量
        users是从域中找到的集合对象
        {hah,ashdhf,sdahf}
    --%>
    <c:forEach var="user"
               items="${requestScope.users}"
               varStatus="vs">

        <tr>
            <td>${user}
                角标：${vs.index}
                第几个：${vs.count}
                当前对象：${vs.current}</td>
        </tr>

    </c:forEach>
</table>

<%--会在value指向的路径前面，加上项目名--%>
<%--就相当于：day32/index.jsp--%>
<a href="<c:url value="/index.jsp"/>">访问主页</a>
</body>
</html>
