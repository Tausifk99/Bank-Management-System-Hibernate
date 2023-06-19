package com.jsp.BankManager.controller;

import com.jsp.dto.Bank;
import com.jsp.dto.BankManager;
import com.jsp.service.BankManagerService;

public class SaveManager {

	public static void main(String[] args) {
		BankManagerService bankManagerService = new BankManagerService();

		BankManager bm1 = new BankManager();
		bm1.setManager_name("Akash");

		BankManager bm2 = new BankManager();
		bm2.setManager_name("Praful");

		BankManager bankmanager1 = bankManagerService.saveBankManager(bm1);
		BankManager bankmanager2 = bankManagerService.saveBankManager(bm2);
		if (bankmanager1 != null) {
			System.out.println(bankmanager1.getId() + " " + bankmanager1.getManager_name());
		} else {
			System.out.println("Manager Not Save Try Again After Sometime");
		}
		if (bankmanager2 != null) {
			System.out.println(bankmanager2.getId() + " " + bankmanager2.getManager_name());
		} else {
			System.out.println("Manager Not Save Try Again After Sometime");
		}
	}
}
