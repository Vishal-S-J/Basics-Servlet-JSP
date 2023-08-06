<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Servlet to JSP</title>
</head>
<body>
    <%
        String name = request.getParameter("userName");
    %><p>WELCOME :: </p><%= name %>
    <%
        Cookie cookie = new Cookie("userName", name);
        response.addCookie(cookie);
    %>
    <form action="getcookies.jsp" method="post">
        <input type="submit" value="NEXT PAGE">
    </form>
</body>
</html>