package org.session.cookies;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class SetCookiesSample extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        String name = req.getParameter("userName");
        resp.getWriter().println("WELCOME :: "+name);

        Cookie cookie = new Cookie("userName", name);
        resp.addCookie(cookie);

        resp.getWriter().println("<form action='getCookie' method='post'>");
        resp.getWriter().println("<input type='submit' value='NEXT PAGE'>");
        resp.getWriter().println("</form>");
    }
}
