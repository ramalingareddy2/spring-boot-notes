package com.bootec.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.bootec.exception.FuelLevelInsufficentException;

@Component
@ConfigurationProperties(prefix = "engine")
public class Engine {
	private int engineNo;
	private int capacity;
	private String fuelType;
	private int fuelLevel;

	public void start() {
		if (fuelLevel <= 5) {
			throw new FuelLevelInsufficentException("FuelLevel is not sufficient to start the engine");
		}
		System.out.println("engine started...");
	}

	public int getEngineNo() {
		return engineNo;
	}

	public void setEngineNo(int engineNo) {
		this.engineNo = engineNo;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getFuelLevel() {
		return fuelLevel;
	}

	public void setFuelLevel(int fuelLevel) {
		this.fuelLevel = fuelLevel;
	}

	@Override
	public String toString() {
		return "Engine [engineNo=" + engineNo + ", capacity=" + capacity + ", fuelType=" + fuelType + ", fuelLevel="
				+ fuelLevel + "]";
	}

}
