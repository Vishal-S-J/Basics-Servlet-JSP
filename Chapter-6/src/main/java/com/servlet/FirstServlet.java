package com.servlet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.PrintWriter;

public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        try {
            resp.setContentType("text/html");
            PrintWriter printWriter = resp.getWriter();

            String name = req.getParameter("name");
            printWriter.print("Welcome " + name);

            //appending the username in the query string
            printWriter.print("<a href='secondPage?uname=" + name + "'>visit</a>");

            printWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
