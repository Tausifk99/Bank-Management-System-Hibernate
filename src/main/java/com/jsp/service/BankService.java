package com.jsp.service;

import java.util.List;

import com.jsp.dao.BankDao;
import com.jsp.dto.Bank;

public class BankService {

	
       BankDao bdao=new BankDao();
	
	public Bank saveBank(Bank bank)
	{
		if(bank!=null)
		{
			return bdao.saveBank(bank);
		}else
		{
			return null;
		}
	}
	
	public Bank getBankById(int id)
	{
		if(id>0)
		{
			return bdao.getBankById(id);
		}else
		{
			return null;
		}
	}
	
	public List<Bank> getAllBanks()
	{
		return bdao.getAllBanks();
	}
	
	public Bank updateBank(int id,Bank bank)
	{
		if(bank!=null)
		{
			return bdao.updateBank(id,bank);
		}else
		{
			return null;
		}
	}
	
	public boolean deleteBankById(int id)
	{
		if(id>0)
		{
			return bdao.deleteBankById(id);
		}else
		{
			return false;
		}
	}
}
