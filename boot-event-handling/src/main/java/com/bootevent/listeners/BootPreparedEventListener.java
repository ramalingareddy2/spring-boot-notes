package com.bootevent.listeners;

import java.util.Arrays;
import java.util.stream.Stream;

import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;

public class BootPreparedEventListener implements ApplicationListener<ApplicationPreparedEvent> {

	@Override
	public void onApplicationEvent(ApplicationPreparedEvent event) {
		String[] beanDefinitions = event.getApplicationContext().getBeanDefinitionNames();
		Stream.of(Arrays.asList(beanDefinitions)).forEach(System.out::println);

	}

}
