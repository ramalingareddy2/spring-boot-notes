package com.sp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.Environment;

import com.sp.beans.JdbcDataSource;
import com.sp.beans.JdbcTransactionManager;

@Configuration
@Import({ DevConfig.class, TestConfig.class })
@ComponentScan(basePackages = { "com.sp.beans" })
public class RootConfig {
	@Autowired
	private Environment env;

	@Bean
	public JdbcTransactionManager jdbcTransactionManager(JdbcDataSource jdbcDataSource) {
		JdbcTransactionManager jdbcTransactionManager = new JdbcTransactionManager();
		jdbcTransactionManager.setTimeout(Integer.parseInt(env.getProperty("tm.timeout")));
		jdbcTransactionManager.setAutocommit(new Boolean(env.getProperty("tm.autocommit")));
		jdbcTransactionManager.setJdbcDataSource(jdbcDataSource);

		return jdbcTransactionManager;
	}
}
