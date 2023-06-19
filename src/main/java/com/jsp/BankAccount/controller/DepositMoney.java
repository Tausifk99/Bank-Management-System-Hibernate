package com.jsp.BankAccount.controller;

import com.jsp.dto.BankAccount;
import com.jsp.service.BankAccountService;

public class DepositMoney {

	public static void main(String[] args) {
		
		BankAccountService service=new BankAccountService();
	    BankAccount	ba=service.depositMoney(4,9,10000);
	    
	    if(ba!=null)
	    {
	    	System.out.println(ba.getBalance());
	    }else
	    {
	    	System.out.println("Account Not Found");
	    }
	}
}
