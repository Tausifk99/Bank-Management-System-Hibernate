package com.jsp.Bank.controller;

import com.jsp.dto.Bank;
import com.jsp.service.BankService;

public class UpdateBankById {

	public static void main(String[] args) {
		
		BankService s=new BankService();
		
		Bank bank=new Bank();
		bank.setName("BOB");
		
		Bank b=s.updateBank(1, bank);
		if(b!=null)
		{
			System.out.println("Updated Bank "+b.getName());
		}else
		{
			System.out.println("Bank Not Found");
		}
	}
}
