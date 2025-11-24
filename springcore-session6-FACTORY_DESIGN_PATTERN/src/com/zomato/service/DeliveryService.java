package com.zomato.service;

public class DeliveryService {

    public DeliveryService() {
        System.out.println("Delivery Service Initialized");
    }

    public void assignDeliveryPartner(String location) {
        System.out.println("Delivery partner assigned for: " + location);
    }
}