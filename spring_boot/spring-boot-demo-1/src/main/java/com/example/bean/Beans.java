package com.example.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;

@Configuration
@ConfigurationProperties(prefix="beans")
@Data
@ToString
public class Beans {

	private String zzzz;
	private String aaaa;
}
