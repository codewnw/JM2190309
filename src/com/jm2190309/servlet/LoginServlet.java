package com.jm2190309.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userName = request.getParameter("un");
		String password = request.getParameter("pass");

		PrintWriter out = response.getWriter();
		if (userName.equals(password)) {
			String message = "Login Successful!!!";
			System.out.println(message);
			request.setAttribute("msg", message);
			RequestDispatcher rd = request.getRequestDispatcher("profile");
			rd.forward(request, response);
		} else {
			System.out.println("Login Failed!!!");
			//response.sendRedirect("login.html");
			response.sendRedirect("https://www.google.com/");
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
