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
import javax.servlet.annotation.WebFilter;

//@WebFilter(filterName="FirstFilter",urlPatterns= {"*.do","*.jsp"})
@WebFilter(filterName = "FirstFilter", urlPatterns = "/first")
public class FirstFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		System.out.println("进入 Filter");
		chain.doFilter(request, response);
		System.out.println("离开 Filter");

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
