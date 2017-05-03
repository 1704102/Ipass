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
    <link rel="stylesheet" href="StyleSheets/Reserveren.css" type="text/css" >
</head>
<body>
<div class="header">hello</div>
<div class="photo"></div>
<div class="menu">
    <a href="index.jsp"> <div>Home</div></a>
    <a href="Reserveren.jsp"> <div>Reserveren</div></a>
    <div>Info</div>
</div>
<div class="content">
    <div class="form" style="border: 1px solid black;">
        <div style="display:block;">Reservering toevoegen</div>
        <div style="display: inline-block;">
            <label>voornaam</label>
            <label>achternaam</label>
            <label>aantal pesonen</label>
            <label>datum</label>
            <label>tijd</label>
        </div>
        <div style="display:inline-block;">
            <textarea>voornaam</textarea>
            <textarea>achternaam</textarea>
            <select name="number">
                <script>
                    for(var i = 0; i < 21; i++){
                        document.write("<option value='" + i + "'>" + i + "</option>")
                    }
                </script>
            </select>
            <input id="date" type="date">
            <select name="time">
                <script>
                    for(var i = 0; i < 11; i++){
                        var open = 1700;
                        var time = (open + (i *50)).toString()
                        if(time.includes("50")){
                            time = time.replace("50",":30");
                        }else if(time == "2000"){
                            time = "20:00";
                        }else{
                            time = time.replace("00",":00");
                        }

                        console.log(time);
                        document.write("<option value='" + time + "'>" + time + "</option>")
                    }
                </script>
            </select>
    </div>
</div>
<div class="footer"> end</div>
<script type="text/javascript">
    var date = new Date();

    var day = date.getDate();
    var month = date.getMonth() + 1;
    var year = date.getFullYear();

    if (month < 10) month = "0" + month;
    if (day < 10) day = "0" + day;

    var today = year + "-" + month + "-" + day;
    document.getElementById("date").value = today;
</script>
<%--<h3 class="red"><%=Main.hello()%></h3>.--%>
</body>
</html>
