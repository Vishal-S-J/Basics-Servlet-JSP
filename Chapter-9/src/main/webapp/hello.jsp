<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="jakarta.servlet.http.HttpServlet"%>
<%@page import="jakarta.servlet.http.HttpServletRequest"%>
<%@page import="jakarta.servlet.http.HttpServletResponse"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>WELCOME</title>
</head>
<body>
<!-- This is a jsp file which is used insted of servlet -->
<!-- This file takes the username and prints the rest -->
    <%
        String name = request.getParameter("uname");
        out.println("WELCOME TO HELLO PAGE");
    %>
    <h3>WELCOME</h3><%=name%>
</body>
</html>