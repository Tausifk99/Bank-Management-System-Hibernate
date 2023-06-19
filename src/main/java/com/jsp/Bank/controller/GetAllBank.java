package com.jsp.Bank.controller;

import java.util.List;

import com.jsp.dto.Bank;
import com.jsp.service.BankService;

public class GetAllBank {

	public static void main(String[] args) {

		BankService s = new BankService();

		List<Bank> banks = s.getAllBanks();

		if (!banks.isEmpty()) {
			for (Bank b : banks) {
				System.out.println(b.getB_id() + " " + b.getName() + " " + b.getCity());
			}
		} else {
			System.out.println("Banks Not Found");
		}
	}
}
