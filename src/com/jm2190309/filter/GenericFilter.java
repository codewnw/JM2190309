package com.jm2190309.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")
public class GenericFilter implements Filter {

	public GenericFilter() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.print(">> GenereicFilter");
		System.out.print("Locale: " + request.getLocale() + ", ");
		System.out.print("ContentType: " + request.getContentType() + ", ");
		System.out.print("LocalAddr: " + request.getLocalAddr() + ", ");
		System.out.print("RemoteAddr: " + request.getRemoteAddr() + ", ");
		System.out.println();
		chain.doFilter(request, response);
		System.out.println("<< GenereicFilter");
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
