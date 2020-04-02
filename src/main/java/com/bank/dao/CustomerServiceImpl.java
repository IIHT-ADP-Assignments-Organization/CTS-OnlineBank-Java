package com.bank.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bank.models.Customer;
@Component
public class CustomerServiceImpl implements CustomerServiceDao {
	@Autowired
	SessionFactory sessionfactory;

	public boolean createAccount(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean login(String userName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deposit(long accountNumber, String userName, double amount) {
		// TODO Auto-generated method stub
		return false;
	}

	public double checkBalance(long accountNumber) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double withdrawAmount(long accountNumber, String userName, double amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean transfer(long accountNumber, long targetAccountNumber, double amount) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean closeAccount(long accountNumber, String userName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean logout(String userName) {
		// TODO Auto-generated method stub
		return false;
	}

}
