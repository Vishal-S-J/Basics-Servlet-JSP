package com.servlet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class Add extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));

        //PrintWriter: prints text data to a character stream.
        //getWriter :Returns a PrintWriter object that can send character text to the client.
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("SUM IS :: "+(num1+num2));

        //Also, for checking purpose we are printing same data in console
        System.out.println("SUM IS :: "+(num1+num2));
    }
}
