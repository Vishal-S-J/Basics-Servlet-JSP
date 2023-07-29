package org.include;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class SourceServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Add any necessary processing or logic here

        // Set content type and other response headers (if needed)
        resp.setContentType("text/html");

        // Write something to the response
        resp.getWriter().println("<h1>This is the SourceServlet</h1>");

        // Include the response of "IncludedServlet" in the current response
        // You need to provide the correct URL pattern for "IncludedServlet"
        req.getRequestDispatcher("/include").include(req, resp);

        // More content in the "SourceServlet" response
        resp.getWriter().println("<p>End of SourceServlet response</p>");
    }
}
