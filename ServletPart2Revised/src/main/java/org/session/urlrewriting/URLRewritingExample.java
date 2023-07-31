package org.session.urlrewriting;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class URLRewritingExample extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String searchText = req.getParameter("searchText");
        String url = "https://www.google.com/";
        System.out.println(url+"search?q="+searchText);
        resp.sendRedirect(url+"search?q="+searchText);
    }
}
