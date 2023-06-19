package com.jsp.Person.controller;

import java.util.ArrayList;
import com.jsp.dto.Pan;
import com.jsp.dto.Person;
import com.jsp.service.PersonService;

public class SavePerson {

	public static void main(String[] args) {

		PersonService s = new PersonService();
		
		Person person = new Person();
		person.setAge(21);
		person.setName("Tausif");
		person.setStatus("UnApproved");
		Pan pan = new Pan();
		pan.setPan_no("ABCDES4512");
		pan.setPerson(person);
		person.setPan(pan);
		
		Person person1 = new Person();
		person1.setAge(20);
		person1.setName("Tanmay");
		person1.setStatus("Approved");
		Pan pan1 = new Pan();
		pan1.setPan_no("LDFHSG4876");
		pan1.setPerson(person1);
		person1.setPan(pan1);
		
		Person person2 = new Person();
		person2.setAge(23);
		person2.setName("Shambhu");
		person2.setStatus("Approved");
		Pan pan2 = new Pan();
		pan2.setPan_no("VCSDD8735");
		pan2.setPerson(person2);
		person2.setPan(pan2);
		
		Person person3 = new Person();
		person3.setAge(23);
		person3.setName("Abhishek");
		person3.setStatus("UnApproved");
		Pan pan3 = new Pan();
		pan3.setPan_no("CAFSDS4452");
		pan3.setPerson(person3);
		person3.setPan(pan3);
		
		Person person4 = new Person();
		person4.setAge(24);
		person4.setName("Krishna");
		person4.setStatus("Approved");
		Pan pan4 = new Pan();
		pan4.setPan_no("FADSE43176");
		pan4.setPerson(person4);
		person4.setPan(pan4);
		
		Person person5 = new Person();
		person5.setAge(22);
		person5.setName("Krushna");
		person5.setStatus("Approved");
		Pan pan5 = new Pan();
		pan5.setPan_no("NJCB8970");
		pan5.setPerson(person5);
		person5.setPan(pan5);
		
		Person person6 = new Person();
		person6.setAge(25);
		person6.setName("Mayur");
		person6.setStatus("UnApproved");
		Pan pan6 = new Pan();
		pan6.setPan_no("VCADS8970");
		pan6.setPerson(person6);
		person6.setPan(pan6);
		
		Person person7 = new Person();
		person7.setAge(22);
		person7.setName("Surya");
		person7.setStatus("Approved");
		Pan pan7 = new Pan();
		pan7.setPan_no("RFDGB8360");
		pan7.setPerson(person7);
		person7.setPan(pan7);
		
		Person person8 = new Person();
		person8.setAge(22);
		person8.setName("Rehman");
		person8.setStatus("Approved");
		Pan pan8 = new Pan();
		pan8.setPan_no("XZCAB86541");
		pan8.setPerson(person8);
		person8.setPan(pan8);
		
		
		ArrayList<Person> persons=new ArrayList<>();
		persons.add(person);
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
		persons.add(person4);
		persons.add(person5);
		persons.add(person6);
		persons.add(person7);
		persons.add(person8);


		boolean p = s.saveMultiplePerson(persons);
		if (p == true) {
			System.out.println("Saved");
		} else {
			System.out.println("Not saved");
		}
	}
}
