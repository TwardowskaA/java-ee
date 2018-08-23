<%--
  Created by IntelliJ IDEA.
  User: Agata
  Date: 2018-08-23
  Time: 19:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Kalkulator</title>
</head>
<body>
<%
    int x = Integer.valueOf(request.getParameter("x"));
    int sum = 0;
    for (; x > 0; x--) {
        sum = sum + x;
        out.print(x + " + ");
    }
    out.print(x-- + "=" + sum);
%>

</body>
</html>
