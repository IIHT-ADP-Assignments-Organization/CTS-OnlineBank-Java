package com.bank.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bank.models.Customer;
import com.bank.services.CustomerService;


public class TestFunctional {
	@Test
	public void testvalidAccountCreation() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("bank-application.xml");
	Customer customer=new Customer();
    customer.setAccountNumber(123456789);
    customer.setAccType("normal");
    customer.setAddress("banglore");
    customer.setAmount(20.50);
    customer.setBalance(1000.50);
    customer.setEmail("john@gmail.com");
    customer.setFirstName("john");
    customer.setGender("female");
    customer.setLastName("merry");
    customer.setPassword("hello123");
    customer.setPhoneNumber(1234567899);
    customer.setUserName("james");
	CustomerService customerservice=(CustomerService) context.getBean("CustomerService");
	boolean created =customerservice.createAccount(customer);
	assertEquals(true,created);
}
	@Test
	public void tesForValidLogin() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("bank-application.xml");
	 Customer customer=new Customer();
	 customer.setAccountNumber(123456789);
	    customer.setAccType("normal");
	    customer.setAddress("banglore");
	    customer.setAmount(20.50);
	    customer.setBalance(1000.50);
	    customer.setEmail("john@gmail.com");
	    customer.setFirstName("john");
	    customer.setGender("female");
	    customer.setLastName("merry");
	    customer.setPassword("hello123");
	    customer.setPhoneNumber(1234567899);
	    customer.setUserName("james");

	    CustomerService customerservice=(CustomerService) context.getBean("CustomerService");
	boolean userdetailsfromdb=customerservice.login(customer.getUserName(), customer.getPassword());
	assertEquals(true,userdetailsfromdb);
}
	@Test
	public void tesForValidTransfer() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("bank-application.xml");
	 Customer customer=new Customer();
	 customer.setAccountNumber(123456789);
	    customer.setAccType("normal");
	    customer.setAddress("banglore");
	    customer.setAmount(20.50);
	    customer.setBalance(1000.50);
	    customer.setEmail("john@gmail.com");
	    customer.setFirstName("john");
	    customer.setGender("female");
	    customer.setLastName("merry");
	    customer.setPassword("hello123");
	    customer.setPhoneNumber(1234567899);
	    customer.setUserName("james");

	    CustomerService customerservice=(CustomerService) context.getBean("CustomerService");
	boolean transfered=customerservice.transfer(customer.getAccountNumber(),123456789, customer.getAmount());
	assertEquals(true,transfered);
}
	@Test
	public void tesForCloseAccount() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("bank-application.xml");
	 Customer customer=new Customer();
	 customer.setAccountNumber(123456789);
	    customer.setAccType("normal");
	    customer.setAddress("banglore");
	    customer.setAmount(20.50);
	    customer.setBalance(1000.50);
	    customer.setEmail("john@gmail.com");
	    customer.setFirstName("john");
	    customer.setGender("female");
	    customer.setLastName("merry");
	    customer.setPassword("hello123");
	    customer.setPhoneNumber(1234567899);
	    customer.setUserName("james");

	    CustomerService customerservice=(CustomerService) context.getBean("CustomerService");
	boolean accclosed=customerservice.closeAccount(customer.getAccountNumber(),customer.getUserName(),customer.getPassword());
	assertEquals(true,accclosed);
}
	@Test
	public void tesForLogout() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("bank-application.xml");
	 Customer customer=new Customer();
	 customer.setAccountNumber(123456789);
	    customer.setAccType("normal");
	    customer.setAddress("banglore");
	    customer.setAmount(20.50);
	    customer.setBalance(1000.50);
	    customer.setEmail("john@gmail.com");
	    customer.setFirstName("john");
	    customer.setGender("female");
	    customer.setLastName("merry");
	    customer.setPassword("hello123");
	    customer.setPhoneNumber(1234567899);
	    customer.setUserName("james");

	    CustomerService customerservice=(CustomerService) context.getBean("CustomerService");
	boolean loggedout=customerservice.logout(customer.getUserName());
	assertEquals(true,loggedout);
}
	@Test
	public void tesForCheckBalance() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("bank-application.xml");
	 Customer customer=new Customer();
	 customer.setAccountNumber(123456789);
	    customer.setAccType("normal");
	    customer.setAddress("banglore");
	    customer.setAmount(20.50);
	    customer.setBalance(1000.50);
	    customer.setEmail("john@gmail.com");
	    customer.setFirstName("john");
	    customer.setGender("female");
	    customer.setLastName("merry");
	    customer.setPassword("hello123");
	    customer.setPhoneNumber(1234567899);
	    customer.setUserName("james");

	    CustomerService customerservice=(CustomerService) context.getBean("CustomerService");
	double balance=customerservice.checkBalance(customer.getAccountNumber());
	assertEquals(true,balance);
}
	@Test
	public void tesForWithdraw() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("bank-application.xml");
	 Customer customer=new Customer();
	 customer.setAccountNumber(123456789);
	    customer.setAccType("normal");
	    customer.setAddress("banglore");
	    customer.setAmount(20.50);
	    customer.setBalance(1000.50);
	    customer.setEmail("john@gmail.com");
	    customer.setFirstName("john");
	    customer.setGender("female");
	    customer.setLastName("merry");
	    customer.setPassword("hello123");
	    customer.setPhoneNumber(1234567899);
	    customer.setUserName("james");

	    CustomerService customerservice=(CustomerService) context.getBean("CustomerService");
	double beforewithdraw=customerservice.checkBalance(customer.getAccountNumber());
	double amountwithdrawn=customerservice.withdrawAmount(customer.getAccountNumber(), customer.getUserName(), customer.getAmount());
	double afterwithdraw=customerservice.checkBalance(customer.getAccountNumber());
double f=beforewithdraw-afterwithdraw;
double get=customer.getAmount();
boolean check=f==get;
	assertEquals(true,check);
}	
	@Test
	public void testForDeposit() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("bank-application.xml");
	Customer customer=new Customer();
    customer.setAccountNumber(123456789);
    customer.setAccType("normal");
    customer.setAddress("banglore");
    customer.setAmount(20.50);
    customer.setBalance(1000.50);
    customer.setEmail("john@gmail.com");
    customer.setFirstName("john");
    customer.setGender("female");
    customer.setLastName("merry");
    customer.setPassword("hello123");
    customer.setPhoneNumber(1234567899);
    customer.setUserName("james");
	CustomerService customerservice=(CustomerService) context.getBean("CustomerService");
	boolean deposited =customerservice.deposit(customer.getAccountNumber(), customer.getUserName(),customer.getAmount());
	assertEquals(true,deposited);
}
	
}
