package com.bootnestedioc;

import java.util.Arrays;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.bootnestedioc.beans.BalanceSheet;
import com.bootnestedservice.config.ServiceConfig;

@SpringBootApplication
public class BootNestedIOCApplication {
	public static void main(String[] args) {
		// ApplicationContext context =
		// SpringApplication.run(BootNestedIOCApplication.class, args);
		SpringApplicationBuilder springApplicationBuilder = new SpringApplicationBuilder();
		springApplicationBuilder = springApplicationBuilder.parent(ServiceConfig.class)
				.child(BootNestedIOCApplication.class);
		SpringApplication springApplication = springApplicationBuilder.build();

		ApplicationContext context = springApplication.run(args);
		
		ApplicationContext parentContext = context.getParent();
		String[] beanDefinitionNames = parentContext.getBeanDefinitionNames();
		Stream.of(Arrays.asList(beanDefinitionNames)).forEach(System.out::println);

		BalanceSheet balanceSheet = context.getBean(BalanceSheet.class);
		balanceSheet.prepareBalanceSheet();
	}
}
