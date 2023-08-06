<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Servlet to JSP</title>
</head>
<body>
    <%= "THIS IS GET COOKIES" %>

    <%
        Cookie[] cookies = request.getCookies();
        if(cookies != null && cookies.length > 0) {
            for(Cookie cookie : cookies) {
                %><p>HELLO :: </p><%=cookie.getName()%> :: <%=cookie.getValue() %>
            <%}
        } else {
            out.println("NO COOKIES FOUND");
        }
    %>
</body>
</html>