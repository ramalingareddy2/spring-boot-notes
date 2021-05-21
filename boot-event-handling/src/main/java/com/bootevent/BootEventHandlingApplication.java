package com.bootevent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.bootevent.beans.PaymentService;
import com.bootevent.listeners.BootEnvironmentPreparedEventListener;
import com.bootevent.listeners.BootPreparedEventListener;
import com.bootevent.listeners.BootStartedEventListener;

@SpringBootApplication
public class BootEventHandlingApplication {

	public static void main(String[] args) {
		BootEnvironmentPreparedEventListener bootEventListener = null;
		BootPreparedEventListener bootPreparedEventListener = null;
		BootStartedEventListener bootStartedEventListener = null;

		bootEventListener = new BootEnvironmentPreparedEventListener();
		bootPreparedEventListener = new BootPreparedEventListener();
		bootStartedEventListener = new BootStartedEventListener();

		SpringApplication springApplication = new SpringApplicationBuilder(BootEventHandlingApplication.class)
				.listeners(bootEventListener).listeners(bootPreparedEventListener).listeners(bootStartedEventListener)
				.build();
		ApplicationContext context = springApplication.run(args);
		PaymentService paymentService = context.getBean(PaymentService.class);
		String status = paymentService.paymentStatus("txno0303");
		System.out.println("status :" + status);

	}

}
