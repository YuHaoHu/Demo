package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
	
@SpringBootApplication
//@RestController

@ServletComponentScan  // //在 springBoot 启动时会扫描@WebServlet， 并将该类实例化
public class ServletApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(ServletApplication.class, args);
	}
}