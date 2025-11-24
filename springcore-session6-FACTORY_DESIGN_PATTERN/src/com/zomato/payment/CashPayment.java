package com.zomato.payment;

public class CashPayment implements Payment {
	@Override
    public void pay(double amount) {
        System.out.println("Cash will be collected on delivery");
    }
}
