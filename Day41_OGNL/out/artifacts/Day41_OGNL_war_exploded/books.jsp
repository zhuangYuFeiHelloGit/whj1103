<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: zyf
  Date: 2018/1/17
  Time: 下午4:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>展示图书</title>
</head>
<body>

    <s:if test="#books != null">
        <table border="1px">
            <s:iterator var="book" value="#books">
                <tr>
                    <td>
                        <s:property value="#book.name"/>
                    </td>
                </tr>
                <tr>
                    <td>${book.author}</td>
                </tr>
                <tr>
                    <td>${book.category}</td>
                </tr>
            </s:iterator>

        </table>
    </s:if>



</body>
</html>
