<%--默认为忽视EL表达式，这里设置为不忽视--%>
<%@page isELIgnored="false" %>
<%@page contentType="text/html;charset=UTF-8"
        language="java" %>
<html>
<body>
<h2>Hello World!</h2>

<h1>login</h1>
<form action="${pageContext.request.contextPath}/login" method="post">

    <label>
        <input type="text" name="username">
    </label><br/>
    <label>
        <input type="password" name="password">
    </label><br/>

    <input type="submit">
</form>

<h1>login2</h1>
<form action="${pageContext.request.contextPath}/login2" method="post">

    <%--
        name属性为username
        会自动找到对应控制器方法参数列表中
        User user这个user参数的username
        通过set方法给这个属性赋值
    --%>
    <label>
        <input type="text" name="username">
    </label><br/>
    <label>
        <input type="password" name="password">
    </label><br/>

    <input type="submit">
</form>

<h1>login3</h1>
<form action="${pageContext.request.contextPath}/login3" method="post">


    <input type="text" name="user.username"><br/>
    <input type="text" name="user.password"><br/>
    <input type="text" name="code"><br/>
    <input type="text" name="message"><br/>
    <input type="text" name="user.list[0]"><br/>
    <input type="text" name="user.list[1]"><br/>
    <input type="text" name="user.list[2]"><br/>
    <%--<input type="text" name="user.map['o1']"><br/>--%>
    <input type="text" name="user.map['o2'].user.username"><br/>
    <input type="submit">

</form>


<h1>login4：回显</h1>
<form action="${pageContext.request.contextPath}/login4" method="post">
    <input type="text" name="username">
    <input type="password" name="password">
    <input type="submit">
</form>

<a href="${pageContext.request.contextPath}/updateById/2">点我</a>
<h1>register</h1>
<form action="${pageContext.request.contextPath}/register" method="post">

    <input type="text" name="username"><br/>
    <input type="password" name="password"><br/>
    <input type="number" name="id"><br/>
    <input type="submit">
</form>

</body>
</html>
