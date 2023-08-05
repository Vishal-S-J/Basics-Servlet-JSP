<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Servlet to JSP</title>
</head>
<body>
    <%= "THIS IS THE SOURCE SERVLET"%>
    <%! String name = "Vishal Jadhav"; %>
    <p>DATA :: </p> <%= name %>
    <%
        request.setAttribute("name", name);
        request.getRequestDispatcher("../forward/target.jsp").forward(request, response);
    %>
</body>
</html>