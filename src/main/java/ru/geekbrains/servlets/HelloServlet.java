package ru.geekbrains.servlets;

import javax.servlet.*;
import java.io.IOException;

public class HelloServlet implements Servlet {

    private transient ServletConfig config;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.config = servletConfig;
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.getWriter().println("<h1>Hello, world</h1>");
    }

    @Override
    public String getServletInfo() {
        return "Java interview, task №6, Hello World servlet";
    }

    @Override
    public void destroy() {

    }
}
