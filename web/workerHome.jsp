<%@ page import="Application.WorkerController" %><%--
  Created by IntelliJ IDEA.
  User: marti
  Date: 21-5-2017
  Time: 23:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <div class="content">
        hello <% WorkerController.getWorker().getName();%>
    </div>
</head>
<body>

</body>
</html>
