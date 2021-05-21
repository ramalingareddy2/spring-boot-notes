package com.bootcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bootcore.beans.Radio;

@SpringBootApplication
public class BootCoreApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootCoreApplication.class, args);
		Radio radio = context.getBean(Radio.class);
		radio.listen(98.3f);
	}
}
