package com.global.itct.filter;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;

public class LogFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String requestURI = ((HttpServletRequest)request).getRequestURI();
		System.out.printf("LogFilter.before requestURI:%s\n", requestURI);
		chain.doFilter(request, response);
		System.out.printf("LogFilter.after requestURI:%s\n", requestURI);
	}

}
