package com.bank.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Transaction")

public class Transaction {
	
	@Id
	   @Column(name="tId")
	   @GeneratedValue(strategy=GenerationType.IDENTITY)	
	long tId;
	
	@Column(name="tType")
	String tType;
	
	@Column(name="description")
	String description;
	
	@Column(name="accountNumber")
	long accountNumber;
	
	public long gettId() {
		return tId;
	}
	public void settId(long tId) {
		this.tId = tId;
	}
	public String gettType() {
		return tType;
	}
	public void settType(String tType) {
		this.tType = tType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
}
