package com.jsp.BankManager.controller;

import com.jsp.service.BankManagerService;

public class DeleteManagerById {

	public static void main(String[] args) {

		BankManagerService service = new BankManagerService();

		boolean b = service.deleteBankManagerById(5);

		if (b == true) {
			System.out.println("Manager is deleted");
		} else {
			System.out.println("Manager is not found plz Provide valid id");
		}
	}
}
