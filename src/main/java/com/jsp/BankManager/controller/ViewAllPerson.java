package com.jsp.BankManager.controller;

import java.util.List;

import com.jsp.dto.Person;
import com.jsp.service.BankManagerService;

public class ViewAllPerson {

	public static void main(String[] args) {

		BankManagerService service = new BankManagerService();

		List<Person> persons = service.viewAllPerson();

		if (!persons.isEmpty()) {
			for (Person p : persons) {
				System.out.println(p.getId() + " " + p.getName() + " " + p.getAge() + " " + p.getStatus());
			}
		} else {
			System.out.println("Persons Not Found");
		}
	}
}
