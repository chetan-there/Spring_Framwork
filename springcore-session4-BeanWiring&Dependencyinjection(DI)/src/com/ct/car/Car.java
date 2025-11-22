package com.ct.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.ct.engine.Engine;

@Component
public class Car {

	@Qualifier("dieselEngine")
    @Autowired
    private Engine engine;

    public void start() {
        engine.start();
    }
    
    public void drive() {
        engine.start();
        System.out.println("Car is running...");
    }
}
