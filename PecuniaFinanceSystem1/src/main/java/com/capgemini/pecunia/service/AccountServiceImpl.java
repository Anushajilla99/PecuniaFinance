package com.capgemini.pecunia.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.pecunia.bean.Account;
import com.capgemini.pecunia.dao.AccountDaoImpl;

@Service
@Transactional
public class AccountServiceImpl implements AccountService 
{
@Autowired
AccountDaoImpl dao;

@Override
public Account accountCreation(Account ac) {
	return dao.accountCreation(ac);
}

@Override
public Account getAccountByAccnum(int accountnumber) 
{
return dao.getAccountByAccnum(accountnumber);
}

@Override
public List<Account> getAllAccount() 
{
return dao.getAllAccount();
}

@Override
public Account deleteByAccountnum(int accountnumber) 
{
	return dao.deleteByAccountnum(accountnumber);
}

@Override
public Account updateAccount(Account ac) {
	return dao.updateAccount(ac);	
}

}