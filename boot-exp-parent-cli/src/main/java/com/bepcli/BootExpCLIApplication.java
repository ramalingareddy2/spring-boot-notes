package com.bepcli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bepcli.beans.Robot;

@SpringBootApplication
public class BootExpCLIApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootExpCLIApplication.class, args);
		Robot robot = context.getBean("robot", Robot.class);
		robot.init();
	}
}
