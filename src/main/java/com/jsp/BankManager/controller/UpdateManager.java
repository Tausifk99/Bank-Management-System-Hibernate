package com.jsp.BankManager.controller;

import com.jsp.dto.BankManager;
import com.jsp.service.BankManagerService;

public class UpdateManager {

	public static void main(String[] args) {
		
		BankManagerService service=new BankManagerService();
		
		BankManager bm=new BankManager();
		bm.setManager_name("Sahil");
		
	    BankManager	bankManager=service.updateBankManager(4,bm);
	    
	    if(bankManager!=null)
	    {
	    	System.out.println(bankManager.getManager_name()+" updated");
	    }else
	    {
	    	System.out.println("Not Update Plz Provide Valid Id");
	    }
	}
}
