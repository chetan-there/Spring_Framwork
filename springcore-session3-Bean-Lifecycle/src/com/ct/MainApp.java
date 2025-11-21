package com.ct;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ct.bean.LifeCycleBean;
import com.ct.config.AppConfig;

/*
This code demonstrates the complete Spring Bean Life Cycle including bean creation, initialization callbacks (@PostConstruct, InitializingBean), custom init method, and destruction callbacks (@PreDestroy, DisposableBean), all triggered during context start and shutdown.
 */
public class MainApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("Getting bean....");
        LifeCycleBean b1 = context.getBean(LifeCycleBean.class);

        System.out.println("Closing the context....");
        context.registerShutdownHook();
    }
}
