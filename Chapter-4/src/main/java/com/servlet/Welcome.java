package com.servlet;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.PrintWriter;

public class Welcome extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        try {
            resp.setContentType("text/html");
            PrintWriter printWriter = resp.getWriter();

            Cookie[] cookie = req.getCookies();

            printWriter.println("HELLO :: " + cookie[0].getValue().toUpperCase());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
