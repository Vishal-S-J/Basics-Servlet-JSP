package com.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // this statement gets the data from the html page    //where uname and pass are names of the tags in html page
        String username = req.getParameter("uname");
        String password = req.getParameter("pass");

        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();

        if(username.equals("admin") && password.equals("admin")) {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("welcome");
            requestDispatcher.forward(req, resp);
        } else {
            printWriter.println("SORRY USERNAME OR PASSWORD INCORRECT");

            // the next statement sends the data of this servlet to index.html
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/index.html");
            requestDispatcher.include(req, resp);
        }
    }
}
