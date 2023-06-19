package com.jsp.BankAccount.controller;

import com.jsp.dto.BankAccount;
import com.jsp.service.BankAccountService;

public class WithdrawMoney {

	public static void main(String[] args) {
		BankAccountService service=new BankAccountService();
		
		BankAccount ba=service.widthrawMoney(4, 9, 30000);
		
		if(ba!=null)
		{
			System.out.println("Withdrawl Successfull remaning balance is "+ba.getBalance());
		}else
		{
			System.out.println("Account Not Found or Less balance");
		}
	}
}
