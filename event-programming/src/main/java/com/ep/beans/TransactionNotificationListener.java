package com.ep.beans;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class TransactionNotificationListener {

	@EventListener
	public void notifyThroughWhatsApp(TransactionNotificationEvent event) {
		System.out.println("sending whats app message to customer with info : " + event.toString());
	}
}
