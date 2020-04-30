package com.capgemini.pecunia.service;

import java.sql.Date;
import java.util.List;

import com.capgemini.pecunia.bean.Transaction;

public interface PassbookMaintenanceService {

	List<Transaction> updatePassbook(long accountId);
	void updatelastUpdated(long accountId);
	
	List<Transaction> accountSummary(long accountId,Date startDate,Date endDate);

	 
}
