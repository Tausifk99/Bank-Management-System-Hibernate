package com.jsp.BankAccount.controller;

import java.util.List;

import com.jsp.dto.BankAccount;
import com.jsp.service.BankAccountService;

public class GetAllBankAccount {

	public static void main(String[] args) {

		BankAccountService service = new BankAccountService();

		List<BankAccount> accounts = service.getAllAccountDetails();

		if (!accounts.isEmpty()) {
			for (BankAccount ba : accounts) {
				System.out.println(
						ba.getAcc_id() + " " + ba.getAccount_no() + " " + ba.getBalance() + " " + ba.getType());
			}
		} else {
			System.out.println("Accounts Not Found");
		}
	}
}
