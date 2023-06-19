package com.jsp.service;

import java.util.List;
import com.jsp.dao.BankAccountDao;
import com.jsp.dto.BankAccount;

public class BankAccountService {

	BankAccountDao bdao=new BankAccountDao();
	
	public BankAccount openAccountById(int p_id,BankAccount bankAccount) {

		return bdao.openAccountById(p_id,bankAccount);
	}

	public BankAccount getAccountDetailsById(int p_id) {
		
		return bdao.getAccountDetailsById(p_id);
	}

	public List<BankAccount> getAllAccountDetails() {
		
		return bdao.getAllAccountDetails();
	}

	public boolean deleteBankAccountById(int acc_id) {
		
		return bdao.deleteBankAccountById(acc_id);
	}

	public BankAccount depositMoney(int acc_id, int p_id, long depositAmmout) {
	  
		return bdao.depositMoney(acc_id, p_id, depositAmmout);
	}

	public BankAccount widthrawMoney(int acc_id, int p_id, long withdrawlMoney) {

		return bdao.widthrawMoney(acc_id, p_id, withdrawlMoney);
	}

	public BankAccount transferMoney(int senderAcc_id, int receiverAcc_id, long transferAmmount) {
		
		return bdao.transferMoney(senderAcc_id, receiverAcc_id, transferAmmount);
	}
}
