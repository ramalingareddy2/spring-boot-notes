package com.bfb;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.ResourceBanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.core.io.ClassPathResource;

@SpringBootApplication
public class BFBApplication {
	public static void main(String[] args) {
		// SpringApplication.run(BFBApplication.class, args);

		SpringApplicationBuilder springApplicationBuilder = new SpringApplicationBuilder(BFBApplication.class);
		//springApplicationBuilder.bannerMode(Mode.OFF);
		springApplicationBuilder.banner(new ResourceBanner(new ClassPathResource("banner1.txt")));
		SpringApplication springApplication = springApplicationBuilder.build();
		springApplication.run(args);

		// ApplicationContext context = new
		// SpringApplicationBuilder(BFBApplication.class).bannerMode(Mode.OFF).build().run(args);
	}
}
