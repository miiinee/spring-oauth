package com.min.oauth;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.min.config", "com.min.oauth.*"})
public class SpringOauth1Application {

	private static final String PROPERTIES = "spring.config.location=classpath:/google.yml";
	
	public static void main(String[] args) {
//		SpringApplication.run(SpringOauth1Application.class, args);
		new SpringApplicationBuilder(SpringOauth1Application.class)
			.properties(PROPERTIES)
			.run(args);
	}

}
