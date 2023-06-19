package com.jsp.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class BankAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int acc_id;
	private long account_no;

	private double balance;
	private String type;

	@OneToOne(cascade = CascadeType.ALL)
	private Person person;

	@OneToOne(cascade = CascadeType.ALL)
	private Bank bank;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAcc_id() {
		return acc_id;
	}

	public long getAccount_no() {
		return account_no;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public void setAccount_no(long account_no) {
		this.account_no = account_no;
	}
}
