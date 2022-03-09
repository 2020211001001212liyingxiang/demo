package com.example.demo;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter writer= response.getWriter();
        writer.println("Hello Client!!!");
    }

    public void dopost(HttpServletRequest request, HttpServletResponse response) {
    }
}
