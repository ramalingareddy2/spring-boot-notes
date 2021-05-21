package com.bootec.exception;

public class FuelLevelInsufficentException extends RuntimeException {
	private static final long serialVersionUID = 894278813086173974L;

	public FuelLevelInsufficentException(String message) {
		super(message);
	}

}
