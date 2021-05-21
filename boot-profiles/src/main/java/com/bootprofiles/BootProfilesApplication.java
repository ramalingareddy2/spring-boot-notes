package com.bootprofiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import com.bootprofiles.beans.Agent;
import com.bootprofiles.beans.Parcel;

@SpringBootApplication
public class BootProfilesApplication {
	@Autowired
	private Environment env;

	@Bean
	public Agent agent() {
		Agent agent = new Agent();

		agent.setAgentNo(Integer.parseInt(env.getProperty("agent.agentNo")));
		agent.setAgentName(env.getProperty("agent.agentName"));
		agent.setMobileNo(env.getProperty("agent.mobileNo"));
		agent.setEmailAddress(env.getProperty("agent.emailAddress"));

		return agent;
	}

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(BootProfilesApplication.class, args);
		Parcel parcel = applicationContext.getBean(Parcel.class);
		System.out.println(parcel);
	}

}
