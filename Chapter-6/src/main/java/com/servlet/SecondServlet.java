package com.servlet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.PrintWriter;

public class SecondServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        try {
            resp.setContentType("text/html");
            PrintWriter printWriter = resp.getWriter();

            //getting value from the query string
            String name = req.getParameter("uname");
            printWriter.print("Hello " + name);

            printWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
