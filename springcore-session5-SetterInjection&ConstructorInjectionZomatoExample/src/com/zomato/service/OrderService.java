package com.zomato.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    private PaymentService paymentService;
    private DeliveryService deliveryService;

    @Autowired
    public OrderService(PaymentService paymentService, DeliveryService deliveryService) {
        this.paymentService = paymentService;
        this.deliveryService = deliveryService;
        System.out.println("OrderService Created (Constructor Injection)");
    }

    public void placeOrder(double amount, String location) {
        System.out.println("========== ORDER DETAILS ==========");
        System.out.println("Order Amount: ₹" + amount);
        System.out.println("Location: " + location);

        paymentService.processPayment(amount);
        deliveryService.assignDeliveryPartner(location);

        System.out.println("Order Placed Successfully! 🎉");
    }
}
