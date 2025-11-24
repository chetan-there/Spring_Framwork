package com.zomato.payment;

import org.springframework.stereotype.Component;

@Component("walletPayment")
public class WalletPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Wallet.");
    }
}
