package com.jsp.BankManager.controller;

import com.jsp.dto.BankManager;
import com.jsp.dto.Person;
import com.jsp.service.BankManagerService;
import com.jsp.service.PersonService;

public class ApprovePersonById {

	public static void main(String[] args) {

		BankManagerService bManagerService = new BankManagerService();

		PersonService personService = new PersonService();
		Person p = personService.getPersonById(9);

		BankManager approvalManager = bManagerService.approvePersonById(9, 3);
		
		if(approvalManager!=null)
		{
			System.out.println(p.getName()+" is Approved by "+approvalManager.getManager_name());
		}else
		{
			System.out.println("Invalid person Or Manager is Not Available");
		}

	}
}
