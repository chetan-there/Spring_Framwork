package com.zomato;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zomato.config.AppConfig;
import com.zomato.service.OrderService;
import com.zomato.service.PaymentService;

public class MainApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService orderService = context.getBean(OrderService.class);
        PaymentService paymentService = context.getBean(PaymentService.class);

        Scanner sc = new Scanner(System.in);

        System.out.println("Select Payment Method:");
        System.out.println("1. UPI");
        System.out.println("2. Card");
        System.out.print("Your choice: ");

        int choice = sc.nextInt();
        paymentService.switchPaymentMethod(choice);

        System.out.print("Enter order amount (e.g. 399.50): ");
        double amount = sc.nextDouble();

        System.out.print("Enter delivery location (e.g. Pune): ");
        String location = sc.next();

        orderService.placeOrder(amount, location);

        context.close();
        sc.close();
    }
}
