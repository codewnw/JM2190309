package com.jm2190309.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/login")
public class LoginFilter implements Filter {

	private static List<String> blockedUsers = new ArrayList<>();

	static {
		blockedUsers.add("abc");
		blockedUsers.add("xyz");
		blockedUsers.add("atul");
	}

	public LoginFilter() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println(">> LoginFilter 1");
		String userName = request.getParameter("un");
		if (!blockedUsers.contains(userName)) {
			chain.doFilter(request, response);
		}
		System.out.println("<< LoginFilter 1");
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
