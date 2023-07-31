package org.listener;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class ListenersExample implements ServletRequestListener, ServletRequestAttributeListener,
        ServletContextListener, ServletContextAttributeListener,
        HttpSessionListener, HttpSessionAttributeListener, HttpSessionBindingListener, HttpSessionActivationListener {
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("SERVLET REQUEST INITIALIZED :: " + sre);
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("SERVLET REQUEST DESTROYED :: " + sre);
    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        System.out.println("SERVLET REQUEST ATTRIBUTE ADDED :: " + srae);
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        System.out.println("SERVLET REQUEST ATTRIBUTE REMOVED :: " + srae);
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        System.out.println("SERVLET REQUEST ATTRIBUTE REPLACED :: " + srae);
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("SERVLET CONTEXT INITIALIZED :: " + sce);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("SERVLET CONTEXT DESTROYED :: " + sce);
    }

    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
        System.out.println("SERVLET CONTEXT ATTRIBUTE ADDED :: " + event);
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
        System.out.println("SERVLET CONTEXT ATTRIBUTE REMOVED :: " + event);
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent event) {
        System.out.println("SERVLET CONTEXT ATTRIBUTE REPLACED :: " + event);
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("HTTP SESSION CREATED :: " + se);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("HTTP SESSION DESTROYED :: " + se);
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        System.out.println("HTTP SESSION ATTRIBUTE BINDING EVENT ADDED :: " + event);
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        System.out.println("HTTP SESSION ATTRIBUTE BINDING EVENT REMOVED :: " + event);
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        System.out.println("HTTP SESSION ATTRIBUTE BINDING EVENT REPLACED :: " + event);
    }

    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        System.out.println("HTTP SESSION ATTRIBUTE BINDING EVENT VALUE BOUND :: " + event);
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        System.out.println("HTTP SESSION ATTRIBUTE BINDING EVENT VALUE UNBOUND :: " + event);
    }

    @Override
    public void sessionDidActivate(HttpSessionEvent se) {
        System.out.println("HTTP SESSION EVENT SESSION DID ACTIVATE :: " + se);
    }

    @Override
    public void sessionWillPassivate(HttpSessionEvent se) {
        System.out.println("HTTP SESSION EVENT SESSION WILL PASSIVATE :: " + se);
    }
}
