package com.example.listener;

/**
 * spring-boot整合Listener
 * <listener>
 *	<listener-class>com.bjsxt.listener.FirstListener</listener-class>
 *</listener>
 */
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class FirstLinsener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		System.out.println("Linstener开始工作=========");

	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("Linstener开始工作=========");
	}

}
