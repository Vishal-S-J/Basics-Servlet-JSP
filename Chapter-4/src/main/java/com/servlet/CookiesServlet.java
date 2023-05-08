package com.servlet;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.PrintWriter;

public class CookiesServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        try {
            resp.setContentType("text/html");
            PrintWriter printWriter = resp.getWriter();

            String username = req.getParameter("username");
            printWriter.println("WELCOME :: "+username.toUpperCase());

            Cookie cookie = new Cookie("username", username);   //creating the cookies object
            resp.addCookie(cookie);

            //creating the form
            printWriter.println("<form action='servlet2' method='post'>");
            printWriter.println("<input type='submit' value='NEXT PAGE' />");
            printWriter.println("</form>");

            printWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
