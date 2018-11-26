package com.example.filter;

/**
 * springboot 整合Filter方式一
 */
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("进入 SercondFilter");
		chain.doFilter(request, response);
		System.out.println("离开 SercondFilter");

	} 

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
