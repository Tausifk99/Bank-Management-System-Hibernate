package com.jsp.Bank.controller;

import com.jsp.dto.Bank;
import com.jsp.service.BankAccountService;
import com.jsp.service.BankManagerService;
import com.jsp.service.BankService;

public class SaveBank {

	public static void main(String[] args) {
		BankManagerService bmservice=new BankManagerService();
		BankAccountService baservice=new BankAccountService();
		BankService bservice=new BankService();
		
		Bank b=new Bank();
		b.setName("SBI");
		b.setCity("Mumbai");
		b.setManagers(bmservice.getAllBankManagers());
		b.setBankAccount(baservice.getAccountDetailsById(3));
		
		Bank bank=bservice.saveBank(b);
		if(bank!=null)
		{
			System.out.println(bank.getB_id()+bank.getName()+bank.getCity());
		}else
		{
			System.out.println("Bank not saved");
		}	
	}
}
