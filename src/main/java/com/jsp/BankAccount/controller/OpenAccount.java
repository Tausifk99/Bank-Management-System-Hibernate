package com.jsp.BankAccount.controller;

import com.jsp.dto.BankAccount;
import com.jsp.service.BankAccountService;
import com.jsp.service.BankService;

public class OpenAccount {

	public static void main(String[] args) {

		BankAccountService accountService = new BankAccountService();
		BankService bankService = new BankService();

		BankAccount ba = new BankAccount();
		ba.setBank(bankService.getBankById(1));
		ba.setAccount_no(123);
		ba.setBalance(1000);
		ba.setType("Saving");
		
		BankAccount bankAccount = accountService.openAccountById(9,ba);
		if (bankAccount != null) {
			System.out.println(
					bankAccount.getAcc_id() + " " + bankAccount.getAccount_no() + " " + bankAccount.getBalance());
		}
	}
}
