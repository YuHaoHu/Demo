//package com.example;
//
//import static org.hamcrest.CoreMatchers.instanceOf;
//
//import java.util.stream.Collectors;
//
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationEvent;
//import org.springframework.context.ApplicationListener;
//import org.springframework.context.annotation.Bean;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.context.support.ServletRequestHandledEvent;
//
//@SpringBootApplication
//@RestController
//
//public class Application {
//
//	@Bean
//	public ApplicationRunner appRunner() {
//		return args -> {
//
//			System.out.println();
//			System.out.println("Applicating Runner:");
//			for (String opt : args.getOptionNames()) {
//				System.out.println(opt);
//				System.out.println("->");
//				System.out.println(args.getOptionValues(opt).stream().collect(Collectors.joining(opt)));
//			}
//		};
//	}
//
//	@Bean
//	public ApplicationListener<ApplicationEvent> helloListener() {
//		final String HELLO_URL = "/hello";
//		return (ApplicationEvent event) -> {
//			if (event instanceof ServletRequestHandledEvent) {
//				ServletRequestHandledEvent e = (ServletRequestHandledEvent) event;
//				if (e.getRequestUrl().equals(HELLO_URL)) {
//					System.out.println("visit hello");
//				}
//			}
//		};
//	}
//}
