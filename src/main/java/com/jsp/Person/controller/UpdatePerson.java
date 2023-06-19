package com.jsp.Person.controller;

import com.jsp.dto.Person;
import com.jsp.service.PersonService;

public class UpdatePerson {

	public static void main(String[] args) {
		
		PersonService s=new PersonService();
		
		Person person=new Person();
			
		person.setAge(22);
		person.setName("Surya");		
		Person p=s.updatePerson(8,person);
		
		if(p!=null)
		{
			System.out.println(p.getName()+" "+p.getStatus()+" "+p.getAge()+" "+p.getId()+" updated successfully");
		}else
		{
			System.out.println("Person not found Plz provide valid Id");
		}
	}
}
