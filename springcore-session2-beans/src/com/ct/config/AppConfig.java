package com.ct.config;
/*
This code demonstrates Spring Bean Scopes, showing how Singleton beans return the same instance while Prototype beans create a new instance on every request using @Component, @Scope, @Configuration, and @ComponentScan.
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ct.bean.PrototypeBean;
import com.ct.bean.SingletonBean;

@ComponentScan(basePackages = "com.ct")
@Configuration
public class AppConfig {

	public PrototypeBean prototype() {
		return new PrototypeBean();
	}

	
	public SingletonBean singleton() {
		return new SingletonBean();
	}

}
