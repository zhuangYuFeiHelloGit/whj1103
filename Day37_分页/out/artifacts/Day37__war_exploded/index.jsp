<%--
  Created by IntelliJ IDEA.
  User: zyf
  Date: 2018/1/12
  Time: 上午10:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c"
          uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>$Title$</title>
    <style type="text/css">
        a {
            text-decoration-line: none;
        }
        form{
            //内联块级元素
            display: inline-block;
        }
        input[type='text']{
            display: inline-block;
            width: 40px;
        }
    </style>
</head>
<body>

<c:if test="${requestScope.pageBean != null}">

    <table border="1px">
        <tr>
            <th>书名</th>
            <th>作者</th>
            <th>价格</th>
            <th>类别</th>
        </tr>

        <c:forEach var="book"
                   items="${requestScope.pageBean.books}">
            <tr>
                <td>${book.bookName}</td>
                <td>${book.author}</td>
                <td>${book.price}</td>
                <td>${book.category}</td>
            </tr>
        </c:forEach>
    </table>


    <%--
      定义一个域属性totalPages
      值为10
    --%>
    <c:set var="totalPages"
           value="${requestScope.pageBean.totalPages}"/>
    <%--<c:if--%>
            <%--test="--%>
      <%--${requestScope.pageBean.totalPages < 10}">--%>
        <%--&lt;%&ndash;如果后端传过来的--%>
        <%--总页数小于10，则把域属性totalPages--%>
        <%--的值更改&ndash;%&gt;--%>
        <%--<c:set var="totalPages"--%>
               <%--value="${requestScope.pageBean.totalPages}"/>--%>
    <%--</c:if>--%>

    <%--
        在域中，保存一个变量begin
    --%>

    <c:set var="begin" value="1"/>
    <c:if test="${requestScope
                .pageBean.pageCode - 5 >= 1}">
        <c:set var="begin"
               value="${requestScope
               .pageBean.pageCode - 5}"/>
    </c:if>


    <c:set var="end" value="${totalPages}"/>
    <c:if test="${requestScope.
                pageBean.pageCode + 4 <= totalPages}">
        <c:set var="end" value="${requestScope.
                pageBean.pageCode + 4}"/>
    </c:if>

    <c:if test="${end <= 10}">
        <c:set var="end" value="10"/>
    </c:if>


    <c:if test="${begin >= end - 9}">
        <c:set var="begin" value="${end - 9}"/>
    </c:if>


    <c:if test="${requestScope
            .pageBean.pageCode > 1}">
        <a href="params?pc=${requestScope
            .pageBean.pageCode - 1}${requestScope.pageBean.params}">上一页</a>
    </c:if>

    <c:forEach
            begin="${begin}"
            end="${end}"
            var="v">
        <a href="params?pc=${v}${requestScope.pageBean.params}">
            <c:if test="${requestScope.pageBean.pageCode==v}">
                ${v}
            </c:if>
            <c:if test="${requestScope.pageBean.pageCode!=v}">
                [${v}]
            </c:if>
        </a>
    </c:forEach>

    <c:if test="${requestScope
            .pageBean.pageCode < totalPages}">
        <a href="params?pc=${requestScope
            .pageBean.pageCode + 1}">下一页</a>
    </c:if>

    <form action="params" method="get">
        <input type="text" name="pc">/${totalPages}
        <input type="submit" value="跳页">

    </form>

</c:if>


</body>
</html>
