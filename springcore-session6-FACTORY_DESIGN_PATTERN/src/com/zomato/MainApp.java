package com.zomato;

import java.util.Scanner;
import com.zomato.service.OrderService;

public class MainApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter food price (Example: 450) : ");
        double price = sc.nextDouble();
        sc.nextLine(); // clear buffer

        System.out.println("Enter delivery location (Example: Pune): ");
        String location = sc.nextLine();

        System.out.println("Choose Payment Method:");
        System.out.println("1. UPI");
        System.out.println("2. CARD");
        System.out.println("3. CASH");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();
        String paymentType = null;

        if (choice == 1) paymentType = "UPI";
        else if (choice == 2) paymentType = "CARD";
        else if (choice == 3) paymentType = "CASH";
        else {
            System.out.println("Invalid choice!");
            return;
        }

        OrderService orderService = new OrderService();
        orderService.placeOrder(price, location, paymentType);

        sc.close();
    }
}
