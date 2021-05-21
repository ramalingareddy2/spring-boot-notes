package com.bootevent.listeners;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

import com.bootevent.beans.PaymentService;

public class BootStartedEventListener implements ApplicationListener<ApplicationStartedEvent>{

	@Override
	public void onApplicationEvent(ApplicationStartedEvent event) {
		PaymentService paymentService = event.getApplicationContext().getBean(PaymentService.class);
		String status = paymentService.paymentStatus("tx");
		System.out.println("status : "+ status);
		
	}
	

}
