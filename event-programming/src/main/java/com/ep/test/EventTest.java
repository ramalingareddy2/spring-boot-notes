package com.ep.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ep.beans.ATMMachine;

public class EventTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.ep.beans");
		ATMMachine atmMachine = context.getBean(ATMMachine.class);
		atmMachine.withdrawl("ac9393", 293.0);
	}
}
