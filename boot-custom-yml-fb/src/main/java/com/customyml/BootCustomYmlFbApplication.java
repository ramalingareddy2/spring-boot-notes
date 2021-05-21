package com.customyml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.customyml.beans.Passenger;
import com.customyml.helper.YamlConfigPropertySourceFactory;

@SpringBootApplication
@PropertySource(name = "attributes", value = "classpath:attributes.yml", factory = YamlConfigPropertySourceFactory.class)
public class BootCustomYmlFbApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootCustomYmlFbApplication.class, args);
		Passenger passenger = context.getBean(Passenger.class);
		System.out.println(passenger);
	}

}
