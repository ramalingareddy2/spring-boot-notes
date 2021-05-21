package com.bec;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.bec.beans.Account;

@Configuration
@ComponentScan(basePackages = { "com.bec.*" })
public class BECApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BECApplication.class, args);
		Account account = context.getBean(Account.class);
		System.out.println(account);
	}
}
