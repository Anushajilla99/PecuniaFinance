package com.capgemini.pecunia.service;

import java.util.List;

import com.capgemini.pecunia.bean.Account;

public interface AccountService {

	Account accountCreation(Account ac);

	Account getAccountByAccnum(int accuntnumber);

	List<Account> getAllAccount();

	Account deleteByAccountnum(int accountnumber);

	Account updateAccount(Account ac);

}