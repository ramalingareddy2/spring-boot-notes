package com.bootcore.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Radio {
	@Autowired
	private Receiver receiver;

	public void listen(float frequency) {
		receiver.tune(frequency);
		System.out.println("listening radio at frequency : " + frequency);
	}

}
