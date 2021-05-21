package com.bec.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Account {
	@Value("${account.accountNo}")
	private String accountNo;
	@Value("${account.accountHolderName}")
	private String accountHolderName;
	@Value("${account.accountType}")
	private String accountType;
	@Value("${account.balance}")
	private double balance;

	String getAccountNo() {
		return accountNo;
	}

	void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	String getAccountHolderName() {
		return accountHolderName;
	}

	void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	String getAccountType() {
		return accountType;
	}

	void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	double getBalance() {
		return balance;
	}

	void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accountHolderName=" + accountHolderName + ", accountType="
				+ accountType + ", balance=" + balance + "]";
	}

}
