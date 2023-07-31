package org.loginlogoutsampleproject;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();

        req.getRequestDispatcher("link.html").include(req, resp);

        String name = req.getParameter("name");
        String password = req.getParameter("password");

        if(password.equals("admin123")){
            printWriter.print("You are successfully logged in!");
            printWriter.print("<br>Welcome, "+name);

            Cookie ck = new Cookie("name",name);
            resp.addCookie(ck);
        }else{
            printWriter.print("sorry, username or password error!");
            req.getRequestDispatcher("login.html").include(req, resp);
        }
    }
}
