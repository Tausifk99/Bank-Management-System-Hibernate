package com.jsp.BankManager.controller;

import com.jsp.dto.BankManager;
import com.jsp.service.BankManagerService;

public class GetManagerById {

	public static void main(String[] args) {

		BankManagerService service = new BankManagerService();

		BankManager bm = service.getBankManagerById(6);
		if (bm != null) {
			System.out.println(bm.getId() + " " + bm.getManager_name());
		} else {
			System.out.println("Manager Not Found");
		}

	}
}
