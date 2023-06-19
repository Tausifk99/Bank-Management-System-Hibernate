package com.jsp.service;

import java.util.ArrayList;
import java.util.List;

import com.jsp.dao.BankManagerDao;
import com.jsp.dto.BankManager;
import com.jsp.dto.Person;

public class BankManagerService {

	BankManagerDao bManagerDao = new BankManagerDao();
	PersonService personService = new PersonService();

	public List<Person> viewAllPerson() {
		return personService.getAllPerson();
	}

	public List<Person> viewAllApprovedPerson() {
		List<Person> approvedPersons = new ArrayList<>();
		List<Person> persons = personService.getAllPerson();

		if (!persons.isEmpty()) {
			for (Person p : persons) {
				if (p.getStatus().equalsIgnoreCase("Approved")) {
					approvedPersons.add(p);
				}
			}
		} else {
			return null;
		}
		return approvedPersons;
	}

	public List<Person> viewAllUnApprovedPerson() {
		List<Person> unApprovedPersons = new ArrayList<>();
		List<Person> persons = personService.getAllPerson();

		if (!persons.isEmpty()) {
			for (Person p : persons) {
				if (p.getStatus().equalsIgnoreCase("UnApproved")) {
					unApprovedPersons.add(p);
				}
			}
		} else {
			return null;
		}
		return unApprovedPersons;
	}

	public BankManager approvePersonById(int p_id, int m_id) {

		if (p_id > 0 && m_id > 0) {
			BankManager bm = getBankManagerById(m_id);
			Person p = personService.getPersonById(p_id);
			if (p_id > 0 && bm != null && p.getAge() >= 18 && p.getPan() != null
					&& p.getStatus().equalsIgnoreCase("UnApproved")) {
				p.setStatus("Approved");
				personService.updatePerson(p_id, p);
				return bm;
			} else {
				return null;
			}
		} else {
			return null;
		}

	}

	public BankManager saveBankManager(BankManager bankManager) {
		if (bankManager != null) {
			return bManagerDao.saveBankManager(bankManager);
		} else {
			return null;
		}
	}

	public BankManager getBankManagerById(int id) {
		if (id > 0) {
			return bManagerDao.getBankManagerById(id);
		} else {
			return null;
		}
	}

	public List<BankManager> getAllBankManagers() {
		return bManagerDao.getAllBankManagers();
	}

	public BankManager updateBankManager(int m_id, BankManager bankManager) {

		if (m_id > 0 && bankManager != null) {
			return bManagerDao.updateBankManager(m_id, bankManager);
		} else {
			return null;
		}
	}

	public boolean deleteBankManagerById(int id) {
		if (id > 0) {
			return bManagerDao.deleteBankManagerById(id);
		} else {
			return false;
		}
	}

	public boolean saveMultipleBankManager(List<BankManager> bankManagers) {
		if (!bankManagers.isEmpty()) {
			return bManagerDao.saveMultipleBankManager(bankManagers);
		} else {
			return false;
		}
	}
}
