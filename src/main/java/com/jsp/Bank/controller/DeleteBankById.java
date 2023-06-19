package com.jsp.Bank.controller;

import com.jsp.service.BankService;

public class DeleteBankById {

	public static void main(String[] args) {

		BankService s = new BankService();

		boolean b = s.deleteBankById(1);

		if (b ==true) {
			System.out.println("Bank deleted");
		} else {
			System.out.println("Bank Not Found");
		}
	}
}
