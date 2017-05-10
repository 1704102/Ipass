<%--
  Created by IntelliJ IDEA.
  User: marti
  Date: 10-5-2017
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="StyleSheets/Reserveren.css" type="text/css">
</head>
<body>
<form class="form" action="${pageContext.request.contextPath}/login.jsp" method="post">
    <div style="display: inline-block;">
        <label>username</label>
        <label> password</label>
    </div>
    <div style="display: inline-block;">
        <textarea placeholder="username"></textarea>
        <textarea placeholder="*****"></textarea>
    </div>
</form>
</body>
</html>
