package com.bootevent.beans;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
	public String paymentStatus(String transactionNo) {
		return "paid";
	}
}
