package com.zomato.service;

import org.springframework.stereotype.Component;

@Component
public class DeliveryService {

    public DeliveryService() {
        System.out.println("Delivery Service Initialized");
    }

    public void assignDeliveryPartner(String location) {
        System.out.println("Delivery Agent assigned for: " + location);
    }
}
