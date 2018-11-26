package com.example;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.Beans;
import com.example.bean.ConfigBean;
import com.example.bean.User;

/*
 * 如果类不在类路径中，则可以使用注释的excludeName属性，并指定完全限定名。
 * 最后，您还可以通过spring.autoconfigure控制要排除的自动配置类的列表。
 * @Configuration
 * @SpringBootApplication(exclude="完全限定名")
 * */
@SpringBootApplication
@RestController
public class SpringBootDemo1Application {

//	@Value("${name}")
//	private String name;
	
	@Autowired
	ConfigBean configbean;
	
	@Autowired
	User user;
	
	@Autowired
	private Beans beans;
	
	
	@RequestMapping("hello")
	public String hello() {
//		return "Hello,World!"+name;
		return "Hello,World!"+configbean+user+beans;
	}
	
	
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args ->{
			System.out.println("list beans"+ctx.getBeanDefinitionCount());
			
			String [] beanNames =ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}
		};
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo1Application.class, args);
	}
}
