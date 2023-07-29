package org.forward;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class SourceServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Add any necessary processing or logic here

        // Forward the request and response to the "TargetServlet"
        // You need to provide the correct URL pattern for the "TargetServlet"
        req.getRequestDispatcher("/target").forward(req, resp);
    }
}
