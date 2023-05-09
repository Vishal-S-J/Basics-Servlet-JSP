package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter printWriter = resp.getWriter();

        String fname = req.getParameter("fname");
        String lname = req.getParameter("lname");
        int age = Integer.parseInt(req.getParameter("age"));
        String address = req.getParameter("address");

        HttpSession httpSession = req.getSession();
        httpSession.setAttribute("fname", fname);
        httpSession.setAttribute("lname", lname);
        httpSession.setAttribute("age", age);
        httpSession.setAttribute("address", address);

        printWriter.println("<a href=\"details\">NEXT PAGE</a>\n");

        printWriter.close();
    }
}
