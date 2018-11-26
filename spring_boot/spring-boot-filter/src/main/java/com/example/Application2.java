package com.example;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.example.filter.SecondFilter;
import com.example.servlet.SecondServlet;
/**
 * springboot整合Filter方式二
 * 
 */


@SpringBootApplication

public class Application2 {

	public static void main(String[] args) {
		SpringApplication.run(Application2.class, args);
	}
	/**
	 * 注册servlet
	 * @return
	 */
	@Bean
	public ServletRegistrationBean getservletRegistrationBean() {
		ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new SecondServlet());
		servletRegistrationBean.addUrlMappings("/second");
		return servletRegistrationBean;
	}
	
	/**
	 * 注册filter方法
	 * @return
	 */
	
	@Bean
	public FilterRegistrationBean getFilterRegistrationBean() {
		FilterRegistrationBean bean = new FilterRegistrationBean(new SecondFilter());
//		bean.addUrlPatterns(new String[] {"*.do","*.jsp"});
		bean.addUrlPatterns("/second");
		return bean;
	
	}

}