package com.ct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ct.bean.PrototypeBean;
import com.ct.bean.SingletonBean;
import com.ct.config.AppConfig;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		System.out.println("-------SingleTon Test------------ ");
		SingletonBean s1 = context.getBean(SingletonBean.class);
		SingletonBean s2 = context.getBean(SingletonBean.class);

		SingletonBean s3 = context.getBean(SingletonBean.class);
		
		System.out.println(s1==s2);
		
		
		System.out.println("-------Prototype Test------");
		PrototypeBean p1 = context.getBean(PrototypeBean.class);
		PrototypeBean p2 = context.getBean(PrototypeBean.class);

		PrototypeBean p3 = context.getBean(PrototypeBean.class);
		
		
		System.out.println(p1==p2);
		
	}

}
