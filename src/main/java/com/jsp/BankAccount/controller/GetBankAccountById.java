package com.jsp.BankAccount.controller;

import com.jsp.dto.BankAccount;
import com.jsp.service.BankAccountService;

public class GetBankAccountById {

	public static void main(String[] args) {
		
		BankAccountService service=new BankAccountService();
		
		BankAccount ba=service.getAccountDetailsById(1);
		if(ba!=null)
		{
			System.out.println(ba.getAcc_id()+" "+ba.getAccount_no()+" "+ba.getBalance()+" "+ba.getType());
		}else
		{
			System.out.println("Account Are Not Found");
		}
	}
}
