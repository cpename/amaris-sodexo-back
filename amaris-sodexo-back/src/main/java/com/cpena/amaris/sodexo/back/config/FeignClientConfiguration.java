package com.cpena.amaris.sodexo.back.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Logger;

@Configuration
public class FeignClientConfiguration {
	
	@Bean
	Logger.Level feignLoggerLever() { return Logger.Level.FULL; }

}
