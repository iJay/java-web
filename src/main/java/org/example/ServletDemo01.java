package org.example;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/demo01", loadOnStartup = 0)
public class ServletDemo01 implements Servlet {
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("ServletDemo01 init...");
    }

    public ServletConfig getServletConfig() {
        System.out.println("ServletDemo01 getServletConfig...");
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("ServletDemo01 service...");
    }

    public String getServletInfo() {
        System.out.println("ServletDemo01 getServletInfo...");
        return null;
    }

    public void destroy() {
        System.out.println("ServletDemo01 destroy...");
    }
}
