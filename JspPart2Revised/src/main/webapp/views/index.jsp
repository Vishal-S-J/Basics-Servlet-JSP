<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Servlet to JSP</title>
</head>
<body>

<div class="container">
    <form action="PrintWriter/printwriter.jsp" method="post" class="mt-2">
        <div class="container text-center">
            <button class="btn btn-warning">PrintWriter</button>
        </div>
    </form>
    <form action="RequestDispatcher/forward/source.jsp" method="get" class="mt-2">
        <div class="container text-center">
            <button class="btn bg-primary text-white">RequestDispatcher Forward()</button>
        </div>
    </form>
    <form action="RequestDispatcher/include/sourceservlet.jsp" method="get" class="mt-2">
        <div class="container text-center">
            <button class="btn bg-primary text-white">RequestDispatcher include()</button>
        </div>
    </form>
    <form action="SendRedirect/sendredirect.jsp" method="get" class="mt-2">
        <div class="container text-center">
            <button class="btn bg-primary text-white">sendRedirect()</button>
        </div>
    </form>
    <div class="container text-center mt-2">
        <a href="Session/session.jsp"><button class="btn bg-primary text-white">session</button></a>
    </div>
    <div class="container text-center mt-2">
        <a href="views/index.html"><button class="btn bg-primary text-white">Login Logout Application</button></a>
    </div>
    <form action="urlRewriting" method="get" class="mt-2">
        <div class="container text-center">
            <input style="width:90%" type="text" name="searchText" placeholder="Enter Text To Search on google">
            <button class="btn bg-primary text-white">SEARCH</button>
        </div>
    </form>
    <div class="container text-center mt-2">
        <a href="HttpSession.html"><button class="btn bg-primary text-white">Http Session</button></a>
    </div>
    <div class="container text-center mt-2">
        <a href="jdbc.html"><button class="btn bg-primary text-white">EMPLOYEE JDBC</button></a>
    </div>
    <form action="AnnotationExample" method="get" class="mt-2">
        <div class="container text-center">
            <button class="btn bg-primary text-white">Annotation</button>
        </div>
    </form>
</div>


<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
</body>
</html>