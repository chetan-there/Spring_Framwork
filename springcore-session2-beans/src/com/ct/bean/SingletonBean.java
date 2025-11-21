package com.ct.bean;

import org.springframework.stereotype.Component;


// created the singletonBean and it is the default beans scope 
@Component
public class SingletonBean {

	public SingletonBean(){
		System.out.println("singletone bean created");
	}

}