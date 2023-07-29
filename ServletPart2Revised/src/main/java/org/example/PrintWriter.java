package org.example;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * PrintWriter is a class and
 * getWriter() is and object of the ServletResponse
 * */
public class PrintWriter extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        java.io.PrintWriter printWriter = resp.getWriter();
        printWriter.println("HELLO THIS IS PRINTWRITER CLASS");
    }
}
