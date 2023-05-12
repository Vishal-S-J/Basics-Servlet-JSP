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

            //creating form that have invisible textfield
            printWriter.print("<form action='secondPage'>");
            printWriter.print("<input type='hidden' name='uname' value='" + name + "'>");
            printWriter.print("<input type='submit' value='go'>");
            printWriter.print("</form>");
            printWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
