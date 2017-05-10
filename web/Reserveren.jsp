<html>
<head>
    <title>website</title>
    <link rel="stylesheet" href="StyleSheets/Reserveren.css" type="text/css">
</head>
<body>
    <form class="form" action="${pageContext.request.contextPath}/reservering.jsp" method="post">
            <div style="display: block">Reservering</div>
            <div style="display: inline-block;">
                <label>Voornaam</label>
                <label>Achternaam</label>
                <label>Email</label>
                <label>aantal Personen</label>
                <label>Datum</label>
                <label>Tijd</label>
            </div>
            <div style="display: inline-block;">
                <textarea name="voornaam" placeholder="voornaam"></textarea>
                <textarea name="acternaam" placeholder="achternaam"></textarea>
                <textarea name="email" placeholder="email"></textarea>
                <select name="personen">
                    <script>
                        for(var i = 1; i < 21; i++){
                            document.write("<option value='" + i + "'>" + i + "</option>")
                        }
                    </script>
                </select>
                <input name="date" id="date" type="date">
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
            <div style="display: block;"></div>

            <input type="submit" name="submit" value="submit" />
    </form>
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
</body>
</html>
