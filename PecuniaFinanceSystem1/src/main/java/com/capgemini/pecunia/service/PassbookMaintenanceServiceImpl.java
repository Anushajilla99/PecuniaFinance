package com.capgemini.pecunia.service;

import java.sql.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.pecunia.dao.PassbookMaintenanceDAO;
import com.capgemini.pecunia.bean.Transaction;


@Service
@Transactional
public class PassbookMaintenanceServiceImpl implements PassbookMaintenanceService {

	@Autowired
	private PassbookMaintenanceDAO dao;
	
	public List<Transaction> updatePassbook(int accountId){
		return dao.updatePassbook(accountId);
	}

	@Override
	public void updatelastUpdated(int accountId) {
		 dao.updatelastUpdated(accountId);
		 
	}
	
	@Override
	public List<Transaction> accountSummary(int accountId, Date startDate, Date endDate) {
		System.out.println("in service");
		return dao.accountSummary(accountId, startDate, endDate);
	}


}
