<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Servlet to JSP</title>
</head>
<body>
    <%= "THIS IS THE TARGET SERVLET"%>
    <% String name = (String)request.getAttribute("name"); %>
    <p>Data Received from source servlet NAME :: </p><%= name %>
</body>
</html>