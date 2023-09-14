package com.cpena.amaris.sodexo.back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AmarisSodexoBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmarisSodexoBackApplication.class, args);
	}

}
