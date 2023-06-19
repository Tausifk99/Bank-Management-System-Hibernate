package com.jsp.Person.controller;

import com.jsp.service.PersonService;

public class DeletePersonById {

	public static void main(String[] args) {
		
		PersonService s = new PersonService();
		
		boolean b=s.deletePersonById(14);
		
		if(b==true) {
			System.out.println("Person is deleted");
		}else
		{
			System.out.println("Person is not found plz Provide valid id");
		}
	}
}
