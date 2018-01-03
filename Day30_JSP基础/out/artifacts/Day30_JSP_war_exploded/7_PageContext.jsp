<%--
  Created by IntelliJ IDEA.
  User: zyf
  Date: 2018/1/3
  Time: 下午5:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>PageContext</title>
</head>
<body>
    <%
        //代理域
        //使用PageContext，可以向其他域对象中
        //设置属性
        //给request域设置域属性
//        pageContext.setAttribute(
//        		"game","Page",PageContext.PAGE_SCOPE
//        );
//        pageContext.setAttribute(
//        		"game","Request",PageContext.REQUEST_SCOPE
//        );
//        pageContext.setAttribute(
//        		"game","Session",PageContext.SESSION_SCOPE
//        );
        pageContext.setAttribute(
        		"game","Application",PageContext.APPLICATION_SCOPE
        );

        //全域查找
        Object game =
                //这里就会去PageContext域中
                //找属性名为game的属性
            pageContext.getAttribute(
                "game"
            );
        game =
            pageContext.findAttribute("game");

        out.write(game.toString());
    %>
</body>
</html>
