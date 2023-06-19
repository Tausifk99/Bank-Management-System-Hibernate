package com.jsp.BankAccount.controller;

import com.jsp.service.BankAccountService;

public class DeleteAccountById {

	public static void main(String[] args) {
		
		BankAccountService service=new BankAccountService();
		
		boolean b=service.deleteBankAccountById(1);
		
		if(b==true)
		{
			System.out.println("Account deleted");
		}else
		{
			System.out.println("Account Not Found");
		}
	}
}
