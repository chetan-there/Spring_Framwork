
package com.ct.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class LifeCycleBean implements InitializingBean, DisposableBean {

    public LifeCycleBean() {
        System.out.println("1️ Constructor called: Bean Instantiated means object created");
    }

    @PostConstruct
    public void postConstructMethod() {
        System.out.println("2️ @PostConstruct called: Bean Initialization #1");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("3️ afterPropertiesSet(): InitializingBean #2");
    }

    public void customInit() {
        System.out.println("4️ custom init-method(): Initialization #3");
    }

    @PreDestroy
    public void preDestroyMethod() {
        System.out.println("5️ @PreDestroy called: Bean Destroy Start");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("6️ destroy(): DisposableBean");
    }

    public void customDestroy() {
        System.out.println("7️ custom destroy-method(): Final Destroy");
    }
}
