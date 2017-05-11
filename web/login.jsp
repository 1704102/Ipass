<%@ page import="Application.LoginController" %>
<%@ page import="java.util.concurrent.TimeUnit" %>
<html>
<head>
    <title>website</title>
    <link rel="stylesheet" href="StyleSheets/Reserveren.css" type="text/css">
</head>
<body>
<form class="form" action="${pageContext.request.contextPath}/loginC.jsp" method="post">
    <div style="display: block">login</div>
    <div style="display: inline-block;">
        <label>username</label>
        <label>password</label>
    </div>
    <div style="display: inline-block;">
        <textarea name="username" placeholder="username"></textarea>
        <textarea name="password" placeholder="*****"></textarea>
    </div>
    <div style="display: block;"></div>

    <input type="submit" name="submit" value="submit"/>
</form>


</body>
</html>
