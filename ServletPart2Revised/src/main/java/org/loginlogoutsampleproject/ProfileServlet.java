package org.loginlogoutsampleproject;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class ProfileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter=resp.getWriter();

        req.getRequestDispatcher("link.html").include(req, resp);

        Cookie[] cookies =req.getCookies();
        if(cookies!=null){
            String name=cookies[0].getValue();
            if(!name.equals("")||name!=null){
                printWriter.print("<b>Welcome to Profile</b>");
                printWriter.print("<br>Welcome, "+name);
            }
        }else{
            printWriter.print("Please login first");
            req.getRequestDispatcher("login.html").include(req, resp);
        }
        printWriter.close();
    }
}
