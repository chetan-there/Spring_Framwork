package com.ct.engine;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

@Primary
public class PetrolEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Petrol Engine Starting...");
    }
}
