package com.jsp.BankAccount.controller;

import com.jsp.dto.BankAccount;
import com.jsp.service.BankAccountService;

public class TransferMoney {

	public static void main(String[] args) {
		
		BankAccountService service=new BankAccountService();
		
		BankAccount ba=service.transferMoney(4, 2, 1000);
		
		if(ba!=null)
		{
			System.out.println("Transfer Successfull Your remaining Balance Is "+ba.getBalance());
		}else
		{
			System.out.println("Account Not Found or Less Account balance");
		}
	}
}
