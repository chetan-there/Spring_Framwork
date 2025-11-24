package com.zomato.payment;

import org.springframework.stereotype.Component;

@Component("cardPayment")
public class CardPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Card.");
    }
}
