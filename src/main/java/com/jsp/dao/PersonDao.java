package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Person;

public class PersonDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tausif");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	// save Person
	public Person savePerson(Person person) {
		if (person.getBankAccount() == null) {
			person.setStatus("UnApproved");
			entityTransaction.begin();
			entityManager.persist(person);
			entityTransaction.commit();
			return person;
		} else {
			return null;
		}
	}

	// Get Person By Id
	public Person getPersonById(int id) {
		Person p = entityManager.find(Person.class, id);
		return p;
	}

	// Get All Person
	public List<Person> getAllPerson() {
		String s = "SELECT p FROM Person p";
		Query q = entityManager.createQuery(s);
		List<Person> li = q.getResultList();
		return li;
	}

	// Update Person
	public Person updatePerson(int p_id, Person person) {
		Person p1 = getPersonById(p_id);
		if (p1 != null) {
			entityTransaction.begin();
			if (person.getAge() != 0)
				p1.setAge(person.getAge());
			if (person.getName() != null)
				p1.setName(person.getName());
			if (person.getPan()!=null)
				p1.getPan().setPan_no(person.getPan().getPan_no());
			entityManager.persist(p1);
			entityTransaction.commit();
			return p1;
		} else {
			return null;
		}
	}

	// delete Person By Id
	public boolean deletePersonById(int id) {
		entityTransaction.begin();
		Person p = getPersonById(id);
		if (p != null) {
			entityManager.remove(p);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}
	}

	// save multiple person
	public boolean saveMultiplePerson(List<Person> persons) {
		entityTransaction.begin();

		for (Person p : persons) {
			p.setStatus("UnApproved");
			entityManager.persist(p);
		}
		entityTransaction.commit();
		return true;
	}
}
