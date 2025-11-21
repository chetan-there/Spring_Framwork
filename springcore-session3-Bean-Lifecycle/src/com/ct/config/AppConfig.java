package com.ct.config;


import org.springframework.context.Lifecycle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ct.bean.LifeCycleBean;


@ComponentScan(basePackages = "com.ct")
@Configuration
public class AppConfig {
	
	
	public LifeCycleBean lifecyclebean() {
		return new LifeCycleBean();
	}
}
