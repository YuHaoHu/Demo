package com.example;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.bean.User;

public class Application {

	public static void main(String[] args) {
	
	}

	@Test
	public void testDemo1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationSpring.xml");
		User user = (User)context.getBean("user");
		System.out.println(user);
		((AbstractApplicationContext) context).registerShutdownHook();
	}
}
