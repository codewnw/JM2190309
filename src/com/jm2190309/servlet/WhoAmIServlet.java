package com.jm2190309.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/WhoAmIServlet", "/whoAmI" })
public class WhoAmIServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public WhoAmIServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int age = Integer.parseInt(request.getParameter("age"));
		PrintWriter out = response.getWriter();
		if (age < 6) {
			out.print("You are child.");
		} else if (age >= 6 && age < 12) {
			out.print("You are teen.");
		} else {
			out.print("I don't know");
		}
	}

}
