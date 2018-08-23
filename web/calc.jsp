<%--
  Created by IntelliJ IDEA.
  User: Agata
  Date: 2018-08-23
  Time: 19:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Kalkulator</title>
</head>
<body>
<h1>Wynik dodawania</h1>
<h2>
    <%
        int x = Integer.valueOf(request.getParameter("x"));
        int y = Integer.valueOf(request.getParameter("y"));
        int sum = x + y;
        out.print(x + "+" + y + "=" + sum);
    %>
</h2>
</body>
</html>
