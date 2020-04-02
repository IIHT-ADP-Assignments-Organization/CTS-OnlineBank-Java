package com.bank.test;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bank.common.InvalidCredentials;
import com.bank.common.UserAlreadyExistException;
import com.bank.common.UserDoesNotExistException;
import com.bank.models.Customer;
import com.bank.services.CustomerService;


import junit.framework.Assert;

public class TestException {
	@Test
    public void testForcreateAccount() throws UserAlreadyExistException 
    {
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
	 CustomerService customerservice = (CustomerService) context.getBean("CustomerService");
	 customerservice.createAccount(customer);
	 
Assert.assertEquals(UserAlreadyExistException.message," user already exists !..please login");
    }
	@Test
    public void testForLogin() throws UserDoesNotExistException  
    {
		
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
		 CustomerService customerservice = (CustomerService) context.getBean("CustomerService");
		 customerservice.createAccount(customer);

     CustomerService customerservice1 = (CustomerService) context.getBean("CustomerService");
     customerservice1.login(customer.getUserName(), customer.getPassword());
Assert.assertEquals(UserDoesNotExistException.message," user does not exists !..please register");
     }
	@Test
    public void testForvalidpassword() throws InvalidCredentials  
    {
		
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
     CustomerService customerservice = (CustomerService) context.getBean("CustomerService");
     customerservice.logout(customer.getUserName());
Assert.assertEquals(InvalidCredentials.message,"please enter valid email and password");
     }
	@Test
    public void testForvalidname() throws InvalidCredentials  
    {
		
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
     CustomerService customerservice = (CustomerService) context.getBean("CustomerService");
     customerservice.logout(customer.getUserName());
Assert.assertEquals(InvalidCredentials.message,"please enter valid email and password");
     }
	
}


