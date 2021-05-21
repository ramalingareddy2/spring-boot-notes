package com.bootnestedioc.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BalanceSheet {
	@Autowired
	private Ledger ledger;

	public void prepareBalanceSheet() {
		System.out.println("pulling ledger entries...");
		ledger.entries();
		System.out.println("generating balance sheet...");
	}
}
