package com.ep.beans;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class ATMMachine {
	@Autowired
	private ApplicationEventPublisher applicationEventPublisher;

	public String withdrawl(String accountNo, double amount) {
		// fetch data from database for account and withdraw and update the account

		TransactionNotificationEvent event = new TransactionNotificationEvent(this);
		event.setAccountNo(accountNo);
		event.setAmount(amount);
		event.setMobileNo("986839303");
		event.setAtmMachineNo("ATM202");
		event.setBalance(3939);

		applicationEventPublisher.publishEvent(event);

		return UUID.randomUUID().toString();
	}

}
