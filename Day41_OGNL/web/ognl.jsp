<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: zyf
  Date: 2018/1/17
  Time: 上午10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>OGNL</title>
</head>
<body>

    <%--
        如果使用单引号括起来
        会认为hello是一个字符串

        如果不用单引号括起来
        会认为hello是一个表达式

    --%>

    <%--
        调用字符串对象的length方法
    --%>
    <s:property value="'hello'.length()"/>
    <%--
        使用#，调用request对象
        使用.找到request对象中的hello属性
    --%>
    <s:property value="#request.hello"/>

    <s:property value="@java.lang.Integer@MAX_VALUE"/>
    <s:property value="@@abs(-100)"/>

    <%--
        获取ActionContext中的键值对
        键为show
        输出对应的值
    --%>
    <s:property value="#show"/>

    <%--
        获得栈顶的元素的name属性
    --%>
    <s:property value="name"/>
    索引为1：<s:property value="[1].name"/>
    索引为2：<s:property value="[2].name"/>
    EL全域查找：${name}

    <s:set var="v"
           value="'value'"
           scope="session"/>
    在session中找一下：${sessionScope.v}

    <%--<s:action name="hello"/>--%>

    <s:set var="grade" value="'B'"/>
    <s:if test="#grade == 'A'">
        nb
    </s:if>
    <s:elseif test="#grade == 'B'">
        仍需努力
    </s:elseif>

    <%--
        保存一个路径
        变量名为：books
    --%>
    <s:url value="books.action"
           var="b"/>

    <a href="${b}">去看看书</a>

    <%--
        struts2封装好的超链接标签
        可以使用ognl表达式找到上面url标签
        存起来的路径
    --%>
    <s:a action="%{b}">哈哈哈哈</s:a>

    <%--
        namespace属性：指定命名空间
    --%>
    <s:form action="books"
            method="POST">
        <%--
            通过ognl表达式提交参数
            这里会检查BookAction中是否有
            username属性
            没有的话就会爆红
        --%>
        <s:textfield name="user.username"/>
        <s:set var="sex" value="'女'"/>
        hibernate

        <%--
            list：可选项
            value：默认选中的
            name：对应bookAction中的某个属性

            所以，这三个属性，都在使用ognl表达式
        --%>
        <s:radio list="{'男','女'}"
                 value="sex"
                 name="user.sex"/>
        <s:submit/>
    </s:form>

    <%--
        如果使用${}，那么会去找某个属性
        下面直接{}
        是在使用ognl表达式创建一个集合
    --%>
    <s:select
        list="{'武汉','大连','北京','圣安东尼奥'}"
    />

</body>
</html>
