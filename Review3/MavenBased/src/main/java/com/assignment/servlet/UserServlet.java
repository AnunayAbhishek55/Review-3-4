package com.assignment.servlet;

import com.assignment.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/register")
public class UserServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        User user = new User(name, email, password);

        // Store user in session
        HttpSession session = request.getSession();
        session.setAttribute("user", user);

        // Redirect to profile page
        response.sendRedirect("profile");
    }
}
