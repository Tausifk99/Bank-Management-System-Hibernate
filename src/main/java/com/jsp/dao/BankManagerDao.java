package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.BankManager;

public class BankManagerDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tausif");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	// save manager
	public BankManager saveBankManager(BankManager bankManager) {
		entityTransaction.begin();
		entityManager.persist(bankManager);
		entityTransaction.commit();
		return bankManager;
	}

	// Get manager By Id
	public BankManager getBankManagerById(int id) {
		BankManager bm = entityManager.find(BankManager.class, id);
		return bm;
	}

	// Get All manager
	public List<BankManager> getAllBankManagers() {
		String s = "SELECT b FROM BankManager b";
		Query q = entityManager.createQuery(s);
		List<BankManager> li = q.getResultList();
		return li;
	}

	// Update manager
	public BankManager updateBankManager(int m_id, BankManager bankManager) {

		BankManager manager = getBankManagerById(m_id);
		if (manager != null) {
			entityTransaction.begin();
			if (bankManager.getManager_name() != null)
				manager.setManager_name(bankManager.getManager_name());
			if (bankManager.getBank() != null)
				manager.setBank(bankManager.getBank());

			entityManager.persist(manager);
			entityTransaction.commit();
			return manager;
		} else {
			return null;
		}

	}

	// delete manager By Id
	public boolean deleteBankManagerById(int id) {
		entityTransaction.begin();
		BankManager bm = getBankManagerById(id);
		if (bm != null) {
			entityManager.remove(bm);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}
	}

	// save multiple manager
	public boolean saveMultipleBankManager(List<BankManager> bankManagers) {
		entityTransaction.begin();

		for (BankManager bm : bankManagers) {
			entityManager.persist(bm);
		}
		entityTransaction.commit();
		return true;
	}
}
