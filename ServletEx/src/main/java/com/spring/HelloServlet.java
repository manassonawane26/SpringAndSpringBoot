package com.spring;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

//    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        System.out.println("In Service");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1><b>Hello World!<b><h1>");
    }
}