package com.capgemini.pecunia.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;

import com.capgemini.pecunia.bean.Account;
@Repository
public class AccountDaoImpl implements AccountDao {

	@PersistenceContext	
	 EntityManager em;
	
	@Override
	public Account accountCreation(Account ac) {
		// TODO Auto-generated method stub
		Account a=em.merge(ac);
		return a;
	}
	
	@Override
	public Account getAccountByAccnum(int accountnumber) {
		
		return em.find(Account.class,accountnumber);
	}
	
	@Override
	public List<Account> getAllAccount() {
		Query q=em.createQuery("select m from Account m");
		List<Account> aclist=q.getResultList();
		return aclist;
	}
	@Override
	public Account updateAccount(Account ac) {
		Account a=em.find(Account.class,ac.getAccountnumber());
		if(a!=null)
		{
			a.setCust_name(ac.getCust_name());
			a.setDate_creation(ac.getDate_creation());
			a.setAccount_balance(ac.getAccount_balance());
			
		}
		return a;
			
	}
	@Override	
	public Account deleteByAccountnum(int accountnumber) {
		Account a=em.find(Account.class,accountnumber);
		if(a!=null)
			{em.remove(a);
			}
        return a;
	}
}
