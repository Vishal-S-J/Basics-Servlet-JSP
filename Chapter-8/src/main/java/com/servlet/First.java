package com.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.PrintWriter;

@WebServlet("/firstPage")
public class First extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        try {
            resp.setContentType("text/html");
            PrintWriter printWriter = resp.getWriter();

            printWriter.println("<h3> HELLO WORLD </h3>");
            printWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
