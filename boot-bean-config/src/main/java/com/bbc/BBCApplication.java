package com.bbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import com.bbc.beans.FuelTank;
import com.bbc.beans.Motor;

@SpringBootApplication
public class BBCApplication {
	@Autowired
	private Environment env;

	@Bean
	public Motor motor(FuelTank fuelTank) {
		Motor motor = new Motor();

		motor.setMotorNo(Integer.parseInt(env.getProperty("motorNo")));
		motor.setPower(Integer.parseInt(env.getProperty("power")));
		motor.setFuelTank(fuelTank);
		return motor;
	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BBCApplication.class, args);
		Motor motor = context.getBean("motor", Motor.class);
		System.out.println(motor);
	}
}
