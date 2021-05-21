package com.sp.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sp.beans.JdbcDataSource;
import com.sp.config.RootConfig;

public class SPTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.getEnvironment().setActiveProfiles("dev");
		context.register(RootConfig.class);

		//
		// ((ConfigurableApplicationContext)
		// context).getEnvironment().setActiveProfiles("dev");
		context.refresh();

		JdbcDataSource jdbcDataSource = context.getBean(JdbcDataSource.class);
		System.out.println(jdbcDataSource);
	}
}
