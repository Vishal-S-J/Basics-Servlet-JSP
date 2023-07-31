package org.loginlogoutsampleproject;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class LogoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter=resp.getWriter();


        req.getRequestDispatcher("link.html").include(req, resp);

        Cookie cookie=new Cookie("name","");
        cookie.setMaxAge(0);
        resp.addCookie(cookie);

        printWriter.print("you are successfully logged out!");

    }
}
