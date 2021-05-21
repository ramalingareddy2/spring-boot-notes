package com.customconfig.initializerrs;

import java.io.IOException;
import java.util.List;

import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertySource;

public class YmlConfigApplicationContextInitializer
		implements ApplicationContextInitializer<ConfigurableApplicationContext> {
	@Override
	public void initialize(ConfigurableApplicationContext applicationContext) {
		YamlPropertySourceLoader yamlPropertySourceLoader = null;
		List<PropertySource<?>> propertySources = null;
		ConfigurableEnvironment environment = null;

		try {
			yamlPropertySourceLoader = new YamlPropertySourceLoader();
			propertySources = yamlPropertySourceLoader.load("attributes",
					applicationContext.getResource("classpath:attributes.yml"));
			environment = applicationContext.getEnvironment();

			for (PropertySource<?> propertySource : propertySources) {
				environment.getPropertySources().addLast(propertySource);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
