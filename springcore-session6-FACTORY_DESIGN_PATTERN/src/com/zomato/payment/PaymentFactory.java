package com.zomato.payment;

public class PaymentFactory {

    public static Payment getPayment(String method) {

        if(method.equalsIgnoreCase("UPI")) {
            return new UpiPayment();
        }
        else if(method.equalsIgnoreCase("CARD")) {
            return new CardPayment();
        }
        else if(method.equalsIgnoreCase("CASH")) {
            return new CashPayment();
        }
        else {
            throw new RuntimeException("Invalid Payment Method!");
        }
    }
}