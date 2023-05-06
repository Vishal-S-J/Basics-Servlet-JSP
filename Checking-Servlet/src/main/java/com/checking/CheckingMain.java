package com.checking;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CheckingMain extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("THIS IS CONSOLE OUTPUT AND WILL PROVE THAT SERVLET IS WORKING");
    }
}
