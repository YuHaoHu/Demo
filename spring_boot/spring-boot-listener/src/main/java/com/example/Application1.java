package com.example;
/**
 * spring-boot整合Listener 方式一
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class Application1 {

	public static void main(String[] args) {
		SpringApplication.run(Application1.class, args);
	}
}
