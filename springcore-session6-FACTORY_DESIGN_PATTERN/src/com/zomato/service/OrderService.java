package com.zomato.service;

import com.zomato.payment.Payment;
import com.zomato.payment.PaymentFactory;

public class OrderService {

    private DeliveryService deliveryService;

    public OrderService() {
        this.deliveryService = new DeliveryService();
        System.out.println("OrderService Created");
    }

    public void placeOrder(double amount, String location, String paymentType) {

        System.out.println("---- New Order Received ----");

        // Factory creates correct payment object
        Payment payment = PaymentFactory.getPayment(paymentType);

        // process payment
        payment.pay(amount);

        // assign delivery partner
        deliveryService.assignDeliveryPartner(location);

        System.out.println("Order Placed Successfully 🎉");
    }
}