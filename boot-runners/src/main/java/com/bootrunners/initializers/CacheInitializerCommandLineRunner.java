package com.bootrunners.initializers;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.bootrunners.beans.Cache;

@Component
public class CacheInitializerCommandLineRunner implements CommandLineRunner {
	@Autowired
	private Cache cache;

	@Override
	public void run(String... args) throws Exception {
		Properties props = null;

		props = new Properties();
		props.load(this.getClass().getClassLoader().getResourceAsStream("cities.properties"));
		cache.put("cities", props);
		System.out.println("loaded cities into cache during startup");
	}

}
