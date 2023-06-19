package com.jsp.Person.controller;

import java.util.List;

import com.jsp.dto.Person;
import com.jsp.service.PersonService;

public class GetAllPerson {

	public static void main(String[] args) {

		PersonService s = new PersonService();

		List<Person> persons = s.getAllPerson();
		if (!persons.isEmpty()) {
			for (Person p : persons) {
				System.out.println(p.getId() + " " + p.getName() + " " + p.getStatus() + " " + p.getAge());
			}
		} else {
			System.out.println("Person Not Found");
		}

	}
}
