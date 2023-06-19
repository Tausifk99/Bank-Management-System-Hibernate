package com.jsp.Person.controller;

import com.jsp.dto.Person;
import com.jsp.service.PersonService;

public class GetPersonById {

	public static void main(String[] args) {
		
		PersonService s = new PersonService();
		
		Person p=s.getPersonById(1);
		if(p!=null)
		{
			System.out.println(p.getId()+" "+p.getName()+" "+p.getStatus()+" "+p.getAge());
		}else
		{
			System.out.println("Person Not Found");
		}

	}
}
