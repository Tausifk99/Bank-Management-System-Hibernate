package com.jsp.BankManager.controller;

import java.util.List;

import com.jsp.dto.Person;
import com.jsp.service.BankManagerService;

public class ViewAllApprovedPerson {

	public static void main(String[] args) {

		BankManagerService service = new BankManagerService();

		List<Person> approvedPersons = service.viewAllApprovedPerson();

		if (!approvedPersons.isEmpty()) {
			for (Person p : approvedPersons) {
				System.out.println(p.getId() + " " + p.getName() + " " + p.getAge() + " " + p.getStatus());
			}
		} else {
			System.out.println("No Such Person Found");
		}
	}
}
