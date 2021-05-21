package com.bbc.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FuelTank {
	@Value("${fuelType}")
	private String fuelType;
	@Value("${capacity}")
	private int capacity;

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "FuelTank [fuelType=" + fuelType + ", capacity=" + capacity + "]";
	}

}
