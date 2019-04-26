package com.min.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class AppConfig {
	
	/*
	 * SpringBoot에서 기본적으로 jackson을 지원하고 있어 별도의 의존성 필요 없음
	 * */
	@Bean
	public ObjectMapper objectMapper() {
		return new ObjectMapper();
	}
}
