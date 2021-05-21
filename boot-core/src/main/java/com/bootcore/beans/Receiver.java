package com.bootcore.beans;

import org.springframework.stereotype.Component;

@Component
public class Receiver {
	public void tune(float frequency) {
		System.out.println("tunning to frequency : " + frequency);
	}
}
