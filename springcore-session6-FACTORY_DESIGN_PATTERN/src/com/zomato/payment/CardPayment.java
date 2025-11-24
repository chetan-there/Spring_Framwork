package com.zomato.payment;

public class CardPayment implements Payment {
	@Override
	public void pay(double amount) {
		System.out.println("Paid ₹" + amount + " using Credit/Debit Card");
	}
}
