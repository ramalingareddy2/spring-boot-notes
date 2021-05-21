package com.bootbanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BannerApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BannerApplication.class, args);

	}
}
