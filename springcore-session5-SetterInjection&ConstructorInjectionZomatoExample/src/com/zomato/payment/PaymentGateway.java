package com.zomato.payment;

public interface PaymentGateway {
    void pay(double amount);
}
