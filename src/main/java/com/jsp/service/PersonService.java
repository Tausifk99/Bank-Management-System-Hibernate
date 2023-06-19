package com.jsp.service;

import java.util.List;

import com.jsp.dao.PersonDao;
import com.jsp.dto.Person;

public class PersonService {

	PersonDao personDao=new PersonDao();
	
	public Person savePerson(Person person)
	{
		if(person!=null)
		{
			return personDao.savePerson(person);
		}else
		{
			return null;
		}
	}
	
	public Person getPersonById(int id)
	{
		if(id>0)
		{
			return personDao.getPersonById(id);
		}else
		{
			return null;
		}
	}
	
	public List<Person> getAllPerson()
	{
		return personDao.getAllPerson();
	}
	
	public Person updatePerson(int p_id,Person person)
	{
		if(person!=null)
		{
			return personDao.updatePerson(p_id,person);
		}else
		{
			return null;
		}
	}
	
	public boolean deletePersonById(int id)
	{
		if(id>0)
		{
			return personDao.deletePersonById(id);
		}else
		{
			return false;
		}
	}
	
	public boolean saveMultiplePerson(List<Person> persons)
	{
		if(!persons.isEmpty())
		{
			return personDao.saveMultiplePerson(persons);
		}else
		{
			return false;
		}
	}
}
