package com.capgemini.pecunia.dao;

import java.util.List;

import com.capgemini.pecunia.bean.Account;


public interface AccountDao {

	Account deleteByAccountnum(int accountnumber);

	List<Account> getAllAccount();

	Account getAccountByAccnum(int accountnumber);

	Account accountCreation(Account ac);

	Account updateAccount(Account ac);
}
