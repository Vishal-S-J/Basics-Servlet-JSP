package com.servlet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Add extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) {
        //to get data from the html page we should request parameters from the page
        //like in this case we are getting the data of num1 to num2 from html page to java
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));

        //Since this statement is written in java it will print the data on console
        System.out.println("ADDITION IS :: "+(num1+num2));
    }
}
