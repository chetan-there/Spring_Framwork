package com.zomato.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.zomato.payment.PaymentGateway;

@Component
public class PaymentService {

    @Autowired
    @Qualifier("upiPayment")
    private PaymentGateway upiPayment;

    @Autowired
    @Qualifier("cardPayment")
    private PaymentGateway cardPayment;

    private PaymentGateway currentPayment;

    @Autowired
    public PaymentService(@Qualifier("upiPayment") PaymentGateway paymentGateway) {
        System.out.println("Constructor Injection: Default = UPI Payment");
        this.currentPayment = paymentGateway;
    }

    // called when user chooses payment at runtime
    public void switchPaymentMethod(int choice) {
        if (choice == 1) {
            System.out.println("Switching to UPI Payment...");
            currentPayment = upiPayment;
        } else if (choice == 2) {
            System.out.println("Switching to CARD Payment...");
            currentPayment = cardPayment;
        } else {
            System.out.println("Invalid choice! Using default UPI.");
            currentPayment = upiPayment;
        }
    }

    public void processPayment(double amount) {
        currentPayment.pay(amount);
    }
}
