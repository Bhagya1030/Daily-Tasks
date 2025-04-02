package com.aits.Spring_IOC;

import org.springframework.stereotype.Component;

@Component("phonepay")
public class PhonePay implements PaymentProcessor {

	@Override
	public void doPayment() {
		 System.out.println("Payment done through PhonePay");

	}

}
