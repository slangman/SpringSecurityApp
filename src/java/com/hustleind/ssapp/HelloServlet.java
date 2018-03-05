package com.hustleind.ssapp;

import javax.servlet.http.*;
import java.io.IOException;

/**
 * @author Vasya Pupkin
 * @version 1.0
 */

public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws IOException {
        httpServletResponse.getWriter().print("Hello from servlet");
    }
}
