package org.example;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/demo02", loadOnStartup = -1)
public class ServletDemo02 implements Servlet {
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("ServletDemo02 init...");
    }

    public ServletConfig getServletConfig() {
        System.out.println("ServletDemo02 getServletConfig...");
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("ServletDemo02 service...");
    }

    public String getServletInfo() {
        System.out.println("ServletDemo02 getServletInfo...");
        return null;
    }

    public void destroy() {
        System.out.println("ServletDemo02 destroy...");
    }
}
