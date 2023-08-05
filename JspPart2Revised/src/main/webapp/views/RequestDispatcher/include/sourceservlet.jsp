<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Servlet to JSP</title>
</head>
<body>
    <%= "THIS IS THE SOURCE SERVLET OF THE INCLUDE"%>
    <% request.getRequestDispatcher("../include/includeservlet.jsp").include(request, response); %>
</body>
</html>