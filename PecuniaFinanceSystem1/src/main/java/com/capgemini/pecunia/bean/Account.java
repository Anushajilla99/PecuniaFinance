package com.capgemini.pecunia.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Account")
public class Account {
	@Id
	
	private int accountnumber;

	private String cust_name;
	
	private String date_creation;
	
	private long account_balance;

	public int getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getDate_creation() {
		return date_creation;
	}

	public void setDate_creation(String date_creation) {
		this.date_creation = date_creation;
	}

	public long getAccount_balance() {
		return account_balance;
	}

	public void setAccount_balance(long account_balance) {
		this.account_balance = account_balance;
	}

	
	

	
}