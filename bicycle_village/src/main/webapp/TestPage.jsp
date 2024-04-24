<%--
  Created by IntelliJ IDEA.
  User: Kosta
  Date: 2024-04-24
  Time: 오전 9:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>test success</h1>
    <%
        session.setAttribute("insertBoard",1);
        System.out.println("console test");
    %>
    <a href="${pageContext.request.contextPath}/rest?key=alarm&methodName=insertAlarm">click</a>
    <a href="test">test</a>
</body>
</html>
