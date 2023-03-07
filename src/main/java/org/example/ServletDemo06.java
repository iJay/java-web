package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// @WebServlet("/demo06") // 精确匹配
// @WebServlet("/demo06/*") // 目录匹配
// @WebServlet("*.do") // 扩展名匹配
// @WebServlet("/*") // 任意匹配
// 优先级：精确匹配 > 目录匹配 > 扩展名匹配 > /* > /
@WebServlet("/")// 任意匹配
public class ServletDemo06 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ServletDemo06 doGet...");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ServletDemo06 doPost...");
    }
}
