package com.jsp.Bank.controller;

import com.jsp.dto.Bank;
import com.jsp.service.BankService;

public class GetBankById {

	public static void main(String[] args) {
		
		BankService s=new BankService();
		
		Bank bank=s.getBankById(1);
		
		if(bank!=null)
		{
			System.out.println(bank.getB_id()+" "+bank.getName()+" "+bank.getCity());
		}else
		{
			System.out.println("Bank Not Found");
		}
	}
}
