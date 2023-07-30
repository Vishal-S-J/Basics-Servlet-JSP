package org.redirect;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * In sendRedirect method we can pass url
 * the url may be absolute or relative both can be sent
 *
 * absolute url :- An absolute URL specifies the complete address of a resource,
 * including the protocol (e.g., "http://" or "https://"),
 * the domain or host name, and the path to the resource.
 * It provides the full path required to locate the resource regardless of the current context.
 *
 * relative url :- A relative URL specifies the path to a resource relative to the current context or location.
 * It does not include the protocol or domain name because the browser
 * assumes that the resource is located within the same application or domain.
 * */
public class SendRedirect extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Add any necessary processing or logic here

        // Perform a redirect to the target URL
        // You need to provide the correct URL where you want to redirect the user

//        String relativeURL = "target";
//        resp.sendRedirect(relativeURL);

        String absoluteURL = "https://www.google.com/";
        resp.sendRedirect(absoluteURL);
    }
}
