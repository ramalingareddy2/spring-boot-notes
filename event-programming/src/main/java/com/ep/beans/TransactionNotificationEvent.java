package com.ep.beans;

import org.springframework.context.ApplicationEvent;

public class TransactionNotificationEvent extends ApplicationEvent {
	private String accountNo;
	private String mobileNo;
	private String atmMachineNo;
	private double amount;
	private double balance;

	public TransactionNotificationEvent(Object source) {
		super(source);
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAtmMachineNo() {
		return atmMachineNo;
	}

	public void setAtmMachineNo(String atmMachineNo) {
		this.atmMachineNo = atmMachineNo;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "TransactionNotificationEvent [accountNo=" + accountNo + ", mobileNo=" + mobileNo + ", atmMachineNo="
				+ atmMachineNo + ", amount=" + amount + ", balance=" + balance + "]";
	}

}
