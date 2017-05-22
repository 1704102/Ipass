<%@ page import="Application.Model.Worker" %><%--
  Created by IntelliJ IDEA.
  User: marti
  Date: 22-5-2017
  Time: 22:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="StyleSheets/workerHome.css" type="text/css">
    <title></title>
</head>
<body bgcolor="#b0c4de">
<div class="home">
    <div>
        <div>name:</div>
        <div>birthDate:</div>
        <div>aangenomen:</div>
        <div>email:</div>
    </div>
    <div>
        <div><%=Worker.getVoornaam()%>  <%=Worker.getAchternaam()%></div>
        <div><%=Worker.getGbDatum()%></div>
        <div><%=Worker.getAangenomen()%></div>
        <div><%=Worker.getEmail()%></div>
    </div>
</div>

</body>
</html>
