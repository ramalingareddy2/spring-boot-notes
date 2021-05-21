package com.bootconfigprops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bootconfigprops.beans.Address;

@SpringBootApplication
//@EnableConfigurationProperties
public class BootConfigPropsApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootConfigPropsApplication.class, args);
		Address address = context.getBean(Address.class);
		System.out.println(address);
	}
}
