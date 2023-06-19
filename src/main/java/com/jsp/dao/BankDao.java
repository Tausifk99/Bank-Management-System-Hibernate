package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Bank;

public class BankDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tausif");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	// save bank
	public Bank saveBank(Bank bank) {
		if (bank != null) {
			entityTransaction.begin();
			entityManager.persist(bank);
			entityTransaction.commit();
			return bank;
		} else {
			return null;
		}
	}

	// get bank by id
	public Bank getBankById(int id) {
		Bank b = entityManager.find(Bank.class, id);
		return b;
	}

	// Get All banks
	public List<Bank> getAllBanks() {
		String s = "SELECT b FROM Bank b";
		Query q = entityManager.createQuery(s);
		List<Bank> li = q.getResultList();
		return li;
	}

	// Update Bank
	public Bank updateBank(int id, Bank bank) {
		entityTransaction.begin();
		Bank b = entityManager.find(Bank.class, id);
		if (bank.getName() != null)
			b.setName(bank.getName());
		if (bank.getCity() != null)
			b.setCity(bank.getCity());
		if (bank.getBankAccount() != null)
			b.setBankAccount(bank.getBankAccount());
		if (bank.getManagers()!=null)
			b.setManagers(bank.getManagers());
		entityManager.persist(b);
		entityTransaction.commit();
		return b;
	}

	// delete Bank By Id
	public boolean deleteBankById(int id) {
		entityTransaction.begin();
		Bank b = entityManager.find(Bank.class, id);
//		if (b.getBankAccount() != null)
//			entityManager.remove(b.getBankAccount());
//		if (!b.getManagers().isEmpty())
//			entityManager.remove(b.getManagers());
		entityManager.remove(b);
		entityTransaction.commit();
		return true;
	}
}
