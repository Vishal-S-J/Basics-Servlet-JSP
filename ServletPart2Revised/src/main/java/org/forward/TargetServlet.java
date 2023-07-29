package org.forward;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class TargetServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Add any necessary processing or logic here
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("THIS IS TARGET SERVLET");

        // Retrieve data from the forwarded request (if any)
        String data = (String) req.getAttribute("Data");
        System.out.println("Data received from SourceServlet: "+data);
        // Forwarded response handling (if needed)
        // ...

        // Optionally, you can forward to a JSP or HTML page
        // request.getRequestDispatcher("/target.jsp").forward(request, response);
    }
}
