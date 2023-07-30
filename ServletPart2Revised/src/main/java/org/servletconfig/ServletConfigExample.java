package org.servletconfig;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class ServletConfigExample extends HttpServlet {
    private String customMessage;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        customMessage = getServletConfig().getInitParameter("message").toUpperCase();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        resp.getWriter().println("<p> CUSTOM MESSAGE :: "+customMessage+"</p>");
    }
}
