package com.bootrunners;

import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.bootrunners.beans.Cache;

@SpringBootApplication
public class BootRunnersApplication {
	@Autowired
	private ApplicationContext applicationContext;

	@Bean
	public Cache cache() {
		return Cache.getInstance();
	}

	/*
	 * @Bean public CommandLineRunner debugCommandLineRunner() { return (args) -> {
	 * String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
	 * for (String beanName : beanDefinitionNames) { System.out.println(beanName); }
	 * }; }
	 */

	@Bean
	public CommandLineRunner debugCommandLineRunner() {
		return (args) -> {
			System.out.println("************** command-line runner arguments ***************");
			for (String arg : args) {
				System.out.print(arg + " ");
			}
		};
	}

	@Bean
	public ApplicationRunner debugApplicationRunner() {
		return new ApplicationRunner() {
			@Override
			public void run(ApplicationArguments args) throws Exception {
				System.out.println("************** Non-Option Arguments *******************");
				List<String> nonOptArgs = args.getNonOptionArgs();				
				for (String narg : nonOptArgs) {
					System.out.print(narg + " ");
				}
				System.out.println();
				System.out.println("-------------------------------------");

				System.out.println("*************** option arguments ******************");
				Set<String> optionNames = args.getOptionNames();
				for (String optionName : optionNames) {
					System.out.println("--" + optionName + "=" + args.getOptionValues(optionName));
				}
			}
		};
	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootRunnersApplication.class, args);
		Cache cache = context.getBean(Cache.class);

		Properties props = (Properties) cache.get("cities");
		props.forEach((k, v) -> {
			System.out.println(k + " = " + v);
		});
	}

}
