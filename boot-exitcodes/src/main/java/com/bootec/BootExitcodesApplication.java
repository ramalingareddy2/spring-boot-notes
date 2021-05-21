package com.bootec;

import org.springframework.boot.ExitCodeEvent;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.bootec.beans.Engine;

@SpringBootApplication
public class BootExitcodesApplication {
	/*
	 * @Component private final class SuccessExitCodeGenerator implements
	 * ExitCodeGenerator {
	 * 
	 * @Override public int getExitCode() { return 1; } }
	 */

	@Bean
	public ExitCodeGenerator successExitCodeGenerator() {
		return () -> {
			return 100;
		};
	}

	@Component
	private final class ApplicationExitCodeEventHandler implements ApplicationListener<ExitCodeEvent> {
		@Override
		public void onApplicationEvent(ExitCodeEvent event) {
			// perform the application termination activities based on the exit code
			System.out.println("exit code : " + event.getExitCode());
		}
	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootExitcodesApplication.class, args);
		Engine engine = context.getBean(Engine.class);
		System.out.println(engine);
		engine.start();
		System.exit(SpringApplication.exit(context));
	}

}
