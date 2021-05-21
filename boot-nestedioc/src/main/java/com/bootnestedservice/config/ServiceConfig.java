package com.bootnestedservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bootnestedioc.beans.Ledger;

@Configuration
public class ServiceConfig {

	@Bean
	public Ledger ledger() {
		return new Ledger();
	}
}
