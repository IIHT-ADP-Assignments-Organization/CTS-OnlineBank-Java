package com.bank.services;

import com.bank.models.Customer;

public interface CustomerService {
	
	boolean createAccount(Customer customer);
	boolean login(String userName,String password); 
	boolean deposit(long accountNumber,String userName,double amount);
	double checkBalance(long accountNumber);
	double withdrawAmount(long accountNumber,String userName,double amount);
	boolean transfer(long accountNumber,long targetAccountNumber,double amount);
	boolean closeAccount(long accountNumber,String userName,String password);
	boolean logout(String userName);

}
