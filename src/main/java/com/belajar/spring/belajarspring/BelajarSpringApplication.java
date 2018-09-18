package com.belajar.spring.belajarspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BelajarSpringApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
		return application.sources(BelajarSpringApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(BelajarSpringApplication.class, args);
	}
}
