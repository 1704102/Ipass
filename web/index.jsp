<%@ page import="Application.Main" %><%--
  Created by IntelliJ IDEA.
  User: marti
  Date: 1-5-2017
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>website</title>
  <link rel="stylesheet" href="StyleSheets/Layout.css" type="text/css" >
</head>
<body>
<div class="header">hello</div>
<div class="photo"></div>
<div class="menu">
  <a href="index.jsp"> <div>Home</div></a>
  <a href="Reserveren.jsp"> <div>Reserveren</div></a>
  <div>Info</div>
</div>
<div class="content"> this is the content</div>
<div class="footer"> end</div>
<h3 class="red"><%=Main.hello()%></h3>.
</body>
</html>
