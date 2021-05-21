package com.becp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.becp.beans.StockService;

@SpringBootApplication
public class BECPApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BECPApplication.class, args);
		StockService stockService = context.getBean(StockService.class);
		System.out.println("stock market : " + stockService.getTradingIndex());
	}
}
