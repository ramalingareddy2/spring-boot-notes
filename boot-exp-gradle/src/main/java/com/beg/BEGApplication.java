package com.beg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.beg.beans.Machine;

@SpringBootApplication
public class BEGApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BEGApplication.class, args);
		Machine machine = context.getBean("machine", Machine.class);
		machine.run();
	}
}
