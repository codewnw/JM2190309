package com.jm2190309.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegistrationServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String age = request.getParameter("age");
		String gender = request.getParameter("gender");
		String[] courses = request.getParameterValues("courses");
		String country = request.getParameter("country");
		String comment = request.getParameter("comment");

		System.out.println("----");
		System.out.println("Name: " + name);
		System.out.println("Password: " + password);
		System.out.println("Email: " + email);
		System.out.println("Age: " + age);
		System.out.print("Courses: ");
		for (int i = 0; i < courses.length; i++) {
			System.out.print(courses[i] + " ");
		}
		System.out.println("");
		System.out.println("Country: " + country);
		System.out.println("Comment: " + comment);
		System.out.println("----");

		response.setContentType("text/HTML");
		PrintWriter out = response.getWriter();
		out.println("<h1>Registration Successfull!!!</h1>");
		out.println(name);
	}

}
