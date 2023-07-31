package org.session.httpsession;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class HttpSessionExample extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();

        HttpSession session=req.getSession();
        System.out.println("SESSION ID :: "+session.getId());

        printWriter.print("<a href='httpSessionNextPage.html'>visit</a>");

        printWriter.close();
    }
}
