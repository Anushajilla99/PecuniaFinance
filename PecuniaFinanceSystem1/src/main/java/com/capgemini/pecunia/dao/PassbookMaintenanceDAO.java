package com.capgemini.pecunia.dao;
import java.sql.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.capgemini.pecunia.bean.Account;
import com.capgemini.pecunia.bean.Transaction;

@Repository 
public interface PassbookMaintenanceDAO extends JpaRepository<Account, String> {

	
	
	@Query("select t from Transaction t where t.dateOfTrans<=(select lastUpdated from Account where accountNumber=?1)")
	List<Transaction> updatePassbook(int accountId);
	
	@Modifying
	@Query("Update Account set lastUpdated=(select MAX(dateOfTrans) as MaximumDate from Transaction) where accountNumber=?1")
	void updatelastUpdated(int accountId);
	
	@Query("select t from Transaction t where accId=?1 and t.dateOfTrans>=?2 and t.dateOfTrans<=?3")
	List<Transaction> accountSummary(int accountId, Date startDate,Date endDate);

}
