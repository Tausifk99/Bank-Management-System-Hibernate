package com.jsp.BankManager.controller;

import java.util.List;

import com.jsp.dto.BankManager;
import com.jsp.service.BankManagerService;

public class GetAllManager {

	public static void main(String[] args) {

		BankManagerService service = new BankManagerService();

		List<BankManager> managers = service.getAllBankManagers();
		if (!managers.isEmpty()) {
			for (BankManager bm : managers) {
				System.out.println(bm.getId() + " " + bm.getManager_name());
			}
		} else {
			System.out.println("Person Not Found");
		}

	}
}
