<%@ page import="java.util.List" %>
<%@ page import="com.lanou3g.bean.Book" %><%--
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
    
    
      
      
    <%
      List<Book> books = 
          (List<Book>) request.getAttribute("books");
      if (books != null){
    %>

        <table border="1px">
          <tr>
            <th>书名</th>
            <th>作者</th>
            <th>价格</th>
          </tr>
        
    <%
        for (int i = 0; i < books.size(); i++) {
          Book book = books.get(i);
    %>
          <tr>
            <td><%=book.getBkName()%></td>
            <td><%=book.getAuthor()%></td>
            <td><%=book.getPrice()%></td>
          </tr>
    
    <%
        }
    %>
        </table>
    <%
      }
    %>
      
  </body>
  <script type="text/javascript">
//    $.getJSON("http://localhost:8080/day29/show",
//        function (json,status) {
//        if(status == "success"){
//            $('#username').text(json['username']);
//            $('#password').text(json['password']);
//        }
//    })



  </script>
</html>
