package com.bank.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bank.models.Customer;
public class TestBoundary {
	 @Test
	    public void validPassword()
	    {
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
	        int passwordLength=10;
	assertEquals(passwordLength,customer.getPassword().length());
}
	 @Test
	    public void validPhoneNumber()
	    {
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
	        int phoneNumberLength=10;
	        
	        int getLengthOfNumber=(Integer.toString(customer.getPhoneNumber()).length());
	assertEquals( phoneNumberLength, getLengthOfNumber);
	    }
	 
	 @Test
	    public void validEmail()
	    {
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
	        
	        boolean contains=customer.getEmail().isEmpty();
	        assertEquals(false,contains);
	    }
	 @Test
	    public void validName()
	    {
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
	        int min=2;
	        boolean name=customer.getUserName().length()>min;
	        assertEquals(true,name);
	    }
	 
	 @Test
	    public void validamount()
	    {
		 Customer customer=new Customer();
	        customer.setAccountNumber(123456789);
	        customer.setAccType("normal");
	        customer.setAddress("banglore");
	        customer.setAmount(1000);
	        customer.setBalance(1000.50);
	        customer.setEmail("john@gmail.com");
	        customer.setFirstName("john");
	        customer.setGender("female");
	        customer.setLastName("merry");
	        customer.setPassword("hello123");
	        customer.setPhoneNumber(1234567899);
	        customer.setUserName("james");
	        int cash=1000;
	        boolean amount=customer.getAmount()>=cash;
	        assertEquals(true,amount);
	    }
}
