package com.zomato.payment;

import org.springframework.stereotype.Component;

@Component("upiPayment")
public class UpiPayment implements PaymentGateway {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}
