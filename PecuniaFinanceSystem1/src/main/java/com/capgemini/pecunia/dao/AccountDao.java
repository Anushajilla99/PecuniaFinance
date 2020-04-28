package com.capgemini.pecunia.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.pecunia.bean.Account;

public interface AccountDao  {

	Account deleteByAccountnum(long accountNumber);

	List<Account> getAllAccount();

	Account getAccountByAccnum(long accountNumber);

	Account accountCreation(Account ac);

	Account update(Account ac);
}
