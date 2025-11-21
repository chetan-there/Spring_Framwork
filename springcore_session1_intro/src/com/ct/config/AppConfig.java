package com.ct.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ct.engine.DieselEngine;
import com.ct.engine.PetrolEngine;

@ComponentScan(basePackages = "com.ct")
@Configuration
public class AppConfig {

	@Bean
	public DieselEngine dieselengine() {
		return new DieselEngine();
	}

	@Bean
	public PetrolEngine petrolengine() {
		return new PetrolEngine();
	}

}
