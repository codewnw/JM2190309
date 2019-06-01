package com.jm2190309.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/java" }, initParams = { @WebInitParam(name = "trainerName", value = "Atul"),
		@WebInitParam(name = "trainerMobile", value = "123") })
public class JavaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public JavaServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("Hi, " + request.getParameter("name"));

		ServletConfig config = getServletConfig();
		String trnName = config.getInitParameter("trainerName");
		String trnMobile = config.getInitParameter("trainerMobile");

		out.println("Your trainer is " + trnName + ", Mobile: " + trnMobile);

		ServletContext context = config.getServletContext();
		String instituteName = context.getInitParameter("institute");
		out.println("In institute: " + instituteName);
		context.setAttribute("javaTemp", "Java Temp");
		context.removeAttribute("javaTemp");
	}

}
