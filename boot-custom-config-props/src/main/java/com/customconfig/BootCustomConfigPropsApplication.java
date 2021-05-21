package com.customconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.customconfig.beans.Passport;
import com.customconfig.initializerrs.YmlConfigApplicationContextInitializer;

@SpringBootApplication
//@PropertySource("classpath:attributes.yml")
public class BootCustomConfigPropsApplication {

	public static void main(String[] args) {
		// ApplicationContext context =
		// SpringApplication.run(BootCustomConfigPropsApplication.class, args);
		SpringApplication springApplication = new SpringApplicationBuilder(BootCustomConfigPropsApplication.class)
				.initializers(new YmlConfigApplicationContextInitializer()).build();
		ApplicationContext context = springApplication.run(args);
		Passport passport = context.getBean(Passport.class);
		System.out.println(passport);
	}

}
