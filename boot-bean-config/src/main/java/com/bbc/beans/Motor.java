package com.bbc.beans;

// no source code
public class Motor {
	private int motorNo;
	private int power;
	private FuelTank fuelTank;

	public void setMotorNo(int motorNo) {
		this.motorNo = motorNo;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public void setFuelTank(FuelTank fuelTank) {
		this.fuelTank = fuelTank;
	}

	@Override
	public String toString() {
		return "Motor [motorNo=" + motorNo + ", power=" + power + ", fuelTank=" + fuelTank + "]";
	}

}
