package com.zomato;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zomato.config.AppConfig;
import com.zomato.service.OrderService;
import com.zomato.payment.PaymentStrategy;

public class MainApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Scanner sc = new Scanner(System.in);

        OrderService orderService = context.getBean(OrderService.class);

        System.out.println("Enter amount to pay:");
        double amt = sc.nextDouble();

        System.out.println("Choose Payment Method:");
        System.out.println("1. UPI");
        System.out.println("2. Card");
        System.out.println("3. Wallet");
        System.out.print("Enter option: ");

        int choice = sc.nextInt();

        PaymentStrategy strategy = null;

        switch (choice) {
            case 1:
                strategy = context.getBean("upiPayment", PaymentStrategy.class);
                break;

            case 2:
                strategy = context.getBean("cardPayment", PaymentStrategy.class);
                break;

            case 3:
                strategy = context.getBean("walletPayment", PaymentStrategy.class);
                break;

            default:
                System.out.println("Invalid choice!");
                context.close();
                return;
        }

        orderService.setPaymentStrategy(strategy);
        orderService.placeOrder(amt);

        context.close();
    }
}
