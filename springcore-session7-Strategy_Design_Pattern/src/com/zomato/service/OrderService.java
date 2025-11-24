package com.zomato.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.zomato.payment.PaymentStrategy;

@Component
public class OrderService {

    private PaymentStrategy paymentStrategy;

    // Default Strategy → UPI
    @Autowired
    public OrderService(@Qualifier("upiPayment") PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Setter injection → change strategy at runtime
    @Autowired
    public void setPaymentStrategy(@Qualifier("cardPayment") PaymentStrategy paymentStrategy) {
        System.out.println("Switching Payment Method using Setter...");
        this.paymentStrategy = paymentStrategy;
    }

    public void placeOrder(double amount) {
        System.out.println("Order has been placed!");
        paymentStrategy.pay(amount);
    }
}
