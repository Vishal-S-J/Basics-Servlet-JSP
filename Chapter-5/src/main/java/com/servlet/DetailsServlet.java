package com.servlet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.PrintWriter;

public class DetailsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        try {
            resp.setContentType("text/html");
            PrintWriter out = resp.getWriter();
  
            //Create session to get data from Previous servlet
            HttpSession session = req.getSession(false);
            String fname = (String) session.getAttribute("fname");
            String lname = (String) session.getAttribute("lname");
            int age = (int) session.getAttribute("age");
            String address = (String) session.getAttribute("address");

            out.println("HELLO " + fname.toUpperCase());
            out.println("\n========================================");
            out.println("\n               DETAILS                  ");
            out.println("\n========================================");
            out.println("\nFIRST NAME :: " + fname);
            out.println("\nLAST NAME :: " + lname);
            out.println("\nAGE :: " + age);
            out.println("\nADDRESS :: " + address);
            out.println("\n========================================");
            out.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
