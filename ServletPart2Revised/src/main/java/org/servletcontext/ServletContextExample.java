package org.servletcontext;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class ServletContextExample extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        ServletContext servletContext = getServletContext();

        servletContext.setAttribute("customMessage", "Hello This is from the servlet context");

        resp.setContentType("text/html");

        String customMessage = (String) servletContext.getAttribute("customMessage");
        resp.getWriter().println("<p>CUSTOM MESSAGE :: "+customMessage+"</p>");
    }
}
