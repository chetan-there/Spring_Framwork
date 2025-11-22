package com.ct.engine;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class DieselEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Diesel Engine Started...");
    }
}
